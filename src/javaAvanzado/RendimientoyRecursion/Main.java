package javaAvanzado.RendimientoyRecursion;

import java.io.InputStream;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(suma(5));
        System.out.println(sumaRecursiva(5));
        System.out.println(sumaFuncional(5));
        tailRecursion(5);
        headRecursion(5);

        //SI QUIERO VER EL TIEMPO EN QUE TARDA UNA FUNCIÓN,PUEDO HACERLO ASI:
        long tiempoInicial = System.currentTimeMillis(); /**TIEMPO DE FUNCION ITERATIVA*/
        for (int i = 0 ; i < 10000000 ; i++){    suma(100);   };
        long tiempoFinal = System.currentTimeMillis();
        System.out.println("Tiempo de funcion Iterativa: "+ (tiempoFinal - tiempoInicial));


        long tiempoInicial1 = System.currentTimeMillis();/**TIEMPO DE FUNCION FUNCIONAL*/
        for (int i = 0 ; i < 10000000 ; i++){    sumaFuncional(100);   };
        long tiempoFinal1 = System.currentTimeMillis();
        System.out.println("Tiempo de funcion Funcional: "+ (tiempoFinal1 - tiempoInicial1));


        long tiempoInicial2 = System.currentTimeMillis();/**TIEMPO DE FUNCION RECURSIVA*/
        for (int i = 0 ; i < 10000000 ; i++){    sumaRecursiva(100);   };
        long tiempoFinal2 = System.currentTimeMillis();
        System.out.println("Tiempo de funcion Recursiva: "+ (tiempoFinal2- tiempoInicial2));
    }

    // Función iterativa(normal)
    public static int suma(int valor){
        int result = 0;
        for (int i = 0 ; i <= valor ; i++){
            result+=i;
        }
        return result;
    }

    //Función Funcional
    public static int sumaFuncional(int valor){
        return IntStream.rangeClosed(1,valor).reduce(0,(a,b) -> a+b);
    }

    /**FUNCIÓN RECURSIVA*/
    public static int sumaRecursiva(int valor){
        if (valor == 1){return 1;} //Para que pare en el 1.
        return valor + sumaRecursiva(valor - 1); //Va a iterar en si misma
    }

    // Recursividad por COLA
    public static void tailRecursion(int valor){
        //Muestra t0do el rango de numero hasta el valore ingresado
        if (valor == 0){return;}
        System.out.println(valor);
        tailRecursion(valor - 1);//Retorna
    }

    // Recursividad por CABEZA
    public static void headRecursion(int valor){
        //Muestra t0do el rango de numero hasta el valore ingresado
        if (valor == 0){return;}
        headRecursion(valor - 1);
        System.out.println(valor);//No va imprimir, hasta que la  función se itere y llegue a 0
    }
}
