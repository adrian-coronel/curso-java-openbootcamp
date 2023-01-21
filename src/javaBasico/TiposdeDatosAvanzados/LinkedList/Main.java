package javaBasico.TiposdeDatosAvanzados.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        /*
         * TRES DIFERENCIAS GRANDES ENTRE ARRAYLIST Y LINKEDLIST:
         * 1. Un arraylist utiliza un array de forma subyacente(por debajo) y un linkedlist para
         *    almacenar datos utiliza una estructura de datos llamada LISTA DOBLEMENTE ENLAZADA.
         *
         * 2. Lo que involucra que el ArrayList es mucho más rapido para ALMACENAR y BUSCAR DATOS, por
         *    otra parte la LinkedList lo es para MODIFICAR DATOS.
         *
         * 3. LinkedList implementa de LIST Y DEQUE por lo que podemos usar colas(meter datos por un sitio
         *    y ser extraidos por otros FIFO Y LIFO).
         *
         *    FIFO: Lo primero que entra es lo primero que sale
         *    LIFO: Lo ultimo que entra es lo primero que sale
         */
        LinkedList<String> listaEnlazada = new LinkedList<>();
        listaEnlazada.add("Adrian");
        listaEnlazada.add("Junior");
        listaEnlazada.add("Leonardo");

        //CREAR UNA LINKEDLIST QUE PARTA DE UN ARRAYLIST
        ArrayList<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Adrian");
        listaArrayList.add("Junior");
        listaArrayList.add("Leonardo");


        /**
         * PASO LA LISTA EN EL PARAMETOR :o
         * Asi podria usar el ARRAYLIST para guardar y buscar y la LINKEDLIST para modificar
         * */
        LinkedList<String> listaLinkedList = new LinkedList<>(listaArrayList);
        listaLinkedList.forEach(System.out::println);
    }
}
