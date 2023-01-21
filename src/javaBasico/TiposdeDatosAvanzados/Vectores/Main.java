package javaBasico.TiposdeDatosAvanzados.Vectores;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        /**
         * Los vectores son dinamicos, ya que por debajo es un Array
         * que hira cambiando de CAPACIDAD dependiendo si la
         * pasamos, es decir que la CAPACIDAD hira DUPLICANDOSE(Aprox. doble del TAMAÑO)
         * para poder almacenar el TAMAÑO que tiene el VECTOR
         * */
        Vector<Integer> vector = new Vector<>();

        vector.add(54);
        vector.add(32);
        vector.add(43);

        System.out.println("Datos del Vecto: "+ vector);

        // Tamaño y Capacidad
        int tamaño = vector.size();
        int capacidad = vector.capacity();
        System.out.println("Tamaño: " +tamaño+ " Capacidad: "+ capacidad);//Tamaño 3, Capacidad 10

        /**Sobrepaso la capacidad*/
        vector.add(54);
        vector.add(32);
        vector.add(43);
        vector.add(54);
        vector.add(32);
        vector.add(43);
        vector.add(54);
        vector.add(32);
        vector.add(43);
        int tamaño2 = vector.size();
        int capacidad2 = vector.capacity();
        System.out.println("Tamaño: " +tamaño2+ " Capacidad: "+ capacidad2);//Tamaño 12, Capacidad 20


        //REDUCIR LA CAPACIDAD A IGUAL QUE EL TAMAÑO
        vector.trimToSize();
        System.out.println("Tamaño: " +vector.size()+ " Capacidad: "+ vector.capacity());//Tamaño 12, Capacidad 12


        // Capacidad inicial, Capacidad de Incremento
        Vector<Integer> vector2 = new Vector<>(16555,15);
        /**
         * Es mejor definirle una capacidad inicial con la que creamos que va a llegar,
         * ya que si se crea con una muy baja se va a duplicar en memoria(al momento en que se copia)
         * */

        // COMPARAR DOS VECTORES
        boolean esIgual = vector.equals(vector2);
        System.out.println(esIgual);


        for (int i = 0 ; i < vector.size() ; i++){
            if(i % 2 == 0){
                vector.remove(i);
                continue;
            }
            System.out.println(vector.get(i) + " en posicion: "+ i);
        }





    }


}

/**
 * ¿COMO FUNCIONA?
 * Cuando se pasa la capacidad del vector, por debajo se crea OTRO array nuevo
 * con el DOBLE de capacidad, luego se COPIA los datos del array al nuevo.
 *
 * Esto no sería lo más optimo ya que cuando se realiza una COPIA, es costozo computacionalmente
 * */