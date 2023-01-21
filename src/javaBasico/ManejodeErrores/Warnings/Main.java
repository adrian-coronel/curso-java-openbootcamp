package javaBasico.ManejodeErrores.Warnings;

import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        /**
         * El warnings son los errores de color amarillo que se muestran
         * a la esquina superior derecha, lo recomendable es arreglarlos para
         * que más adelante no proboquen un error
         * */ //Warning -> Dangling Javadoc comment

        HashMap<String, Integer> map = new HashMap<>();

        map.put("uno", 10);
        map.put("dos", 10);
        map.put("tres", 10); //Warning -> Duplicate Map Key
        map.put("tres", 49);
        map.replace("mil",1000);

        System.out.println(map);
        System.out.println(map.get("tres"));



        map.remove("dos");


        for (Map.Entry element : map.entrySet()){
            System.out.println("Clave: "+element.getKey() + ", Value: "+element.getValue());
        }


    }
}
