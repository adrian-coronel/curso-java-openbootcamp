package javaAvanzado.ArgumentosDeEntrada.UnUsoCorrecto;

public class Main {
    public static void main(String[] args) {

        OptionsParser optionsParser = new OptionsParser(args);
        optionsParser.registerOption("minvalue");
        optionsParser.registerOption("maxvalue");
        optionsParser.parse();// Se encarga de ver si existe "minvalue" y "maxvalue", para exstraer el valor

        String minValue = optionsParser.getOption("minvalue");
        System.out.println("Minvalue es: " +minValue);

        /* Librerias que se encargan de hacer esto:
         * https://commons.apache.org/proper/commons-cli/ -> Apache Commons CLI
         * http://martiansoftware.com/jsap/ -> JSAP
         */

    }
}
