package javaBasico.Entrada_Salida.Ejercicio;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        // 1.
        String[] nombres = {"Adrian","Leonardo","Junior","Edilson"};
        for (String nombre : nombres) {
            System.out.println(nombre);
        }


        // 2.
        int[][] numeros = { {16,8,2003} , {13,7,2005} , {27,1,2005} };
        for (int i = 0 ; i < numeros.length ; i++){
            for (int j = 0 ; j < numeros[i].length ; j++) {
                System.out.println(numeros[i][j]);
            }
        }


        //3.
        Vector<String> meses = new Vector<>();
        meses.add("Enero");
        meses.add("Febrero");
        meses.add("Marzo");
        meses.add("Abril");
        meses.add("Mayo");

        meses.remove("Febrero");
        meses.remove("Marzo");
        System.out.println(meses);


        //4.
        /* Entre los principales problemas de usar vectores en el caso dado, sería el consumo computacional,
         * ya que cada vez que se alcanza la capacidad máxima de un vector, se crea uno "nuevo" con
         * el doble de capacidad del anterior, para que luego los datos sean copiados en este nuevo.
         */


        //5.
        List<String> autosList = new ArrayList<>();
        autosList.add("Ferrarí");
        autosList.add("Lamborgini");
        autosList.add("Bugatí");
        autosList.add("Toyota");

        List<String> autosLinkedList = new LinkedList<>(autosList);
        autosList.forEach(System.out::println);
        autosLinkedList.forEach(System.out::println);


        //6.
        List<Integer> numerosArrayList = new ArrayList<>();
        for (int i = 1 ; i <= 10 ; i++){
            numerosArrayList.add(i);
        }

        for (int i = 0 ; i < numerosArrayList.size() ; i++){
            boolean esPar = numerosArrayList.get(i) % 2 == 0;
            if (esPar)
                numerosArrayList.remove(i);
        }
        numerosArrayList.forEach(System.out::println);


        //7.
        try {
            dividePorCero(14);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Demo de código");
        }


        //9.



        // Invertir Cadena
        System.out.println(reverse("Hola mundo"));

    }

    private static void dividePorCero(int i) throws ArithmeticException{
        int divisor = 0;
        if (divisor == 0){
            throw new ArithmeticException("Esto no puede hacerce");
        }
    }

    public static String reverse(String text){
        String reverse = "";
        for (int i = text.length() ; i > 0 ; i--)
            reverse += text.charAt(i-1);
        return reverse;
    }
}
