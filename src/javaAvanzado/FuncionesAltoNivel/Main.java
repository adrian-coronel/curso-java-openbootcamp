package javaAvanzado.FuncionesAltoNivel;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        Funcionales f = new Funcionales();

        f.pruebas();
        f.pruebas2("adrian","19");


        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Paco");
        nombres.add("Jorge");
        nombres.add("Pepe");

        //Recorrer un array mediante programación funcional

        nombres.stream().forEach(System.out::println); //Stream devuelve un array secuencial(lo recorre)

        System.out.println("");

        Stream<String> valores = nombres.stream()
                .map(x -> x.toUpperCase())
                .filter(x -> x.startsWith("P"));
        valores.forEach(System.out::println); //NO PUEDO USAR OTRA VEZ "VALORES", YA QUE SE CONSUME.

        System.out.println("");

        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        IntStream stNumeros = Arrays.stream(numeros);
        Integer resultado = stNumeros.filter(x -> x % 2 == 0).reduce(0,(x, y)->{ // "x" sera inicialmente 0, "y" será el numero par que viene
            System.out.println("X es:"+ x +" Y es:"+ y);
            return x + y; // se sumará los dos valores y el CERO tomará este resultado(sumandose todos los pares)
        });
        System.out.println("Suma de PARES: "+resultado);

        Integer resultado2 = Arrays.stream(numeros).filter(x -> x % 2 == 0).reduce(0, Integer::sum);
        System.out.println(resultado2);

    }


}
