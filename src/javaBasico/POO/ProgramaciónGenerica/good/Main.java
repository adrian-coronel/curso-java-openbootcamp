package javaBasico.POO.ProgramaciónGenerica.good;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /**
         * Al crear mi archivo ArrayList especificando el tipo, evito
         * problemas al insertar otros tipos de Objetos*/
        ArrayList<String> archivos = new ArrayList<>();
        archivos.add("Adrian");
        archivos.add("Junior");
        archivos.add("Leonardo");

        /**
         * Si observamos aqui si nos muestra un error en tiempo de
         * compilación(cuando lo escribimos), a comparación de lo
         * mostrado en el paquete BAD, por ello es mejor encontrarse
         * con un error en tiempo de compilación*/
        //archivos.add(30); -> Desconmentar para ver el error


    }
}
