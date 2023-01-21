package javaBasico.POO.ProgramaciónGenerica.bad;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        //Mi array
        ArrayList1 nombreList = new ArrayList1(5);
        nombreList.add("Adrian");
        nombreList.add("Junior");
        nombreList.add("Leonardo");
        nombreList.add("Edilson");
        nombreList.add(new File("gestion_Pedidos.accdb"));

        //No puede convertir el objeto a String
        //String nombre = archivos.get(1);

        //Hago un "Casting" para solucionar
        String nombre = (String) nombreList.get(1);
        System.out.println(nombre);

        //Otro problema de "CASTING", no puede convertir FILE en String
        /**No muestra el error en tiempo de compilación, sino hasta que lo iniciamos*/
        String objetoFile = (String) nombreList.get(4);
        System.out.println(objetoFile);



        /*--- Voy a almacenar Objetos de Tipo FILE ---*/

        ArrayList1 archivos = new ArrayList1(4);
        archivos.add(new File("gestion_Pedidos.accdb"));

        //Uso de "Casnting" otras vez
        File nombrePersona = (File) archivos.get(0);
        System.out.println(nombrePersona);



    }
}
