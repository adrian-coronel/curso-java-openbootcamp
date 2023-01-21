package javaAvanzado.ArgumentosDeEntrada.UnUsoCorrecto;

import java.util.HashMap;

// Crearemos metodos para fijar Opciones, obtener sus valores y analizar opciones y valores si es que existen
public class OptionsParser {

    private HashMap<String,String> options = new HashMap<>();
    private String args[];

    private OptionsParser(){}
    public OptionsParser(String args[]){
        this.args = args;
    }

    public void registerOption(String optionName){
       options.put(optionName,"");
    }

    public String getOption(String optionName){
        return options.get(optionName);
    }

    public void setOptionValue(String optionName, String optionValue){
        options.replace(optionName,optionValue);
    }
    
    //Aqui implemento la logica:
    public void parse(){
        for (int i = 0 ; i < args.length ; i++){
            //Eliminamos los giones si es que se pasan
            String optionName = args[i].replace("-","");

            if ( options.containsKey(optionName) ){
                setOptionValue(optionName, args[i + 1]);
            }
        }
    }
}
