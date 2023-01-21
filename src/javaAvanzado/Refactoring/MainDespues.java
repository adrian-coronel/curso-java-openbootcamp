package javaAvanzado.Refactoring;

import java.util.Arrays;

public class MainDespues {
    public static void main(String[] args) {

        int[] numeros = { 2, 4, 7, 56, -5 };
        imprimeMayorYMenor(numeros);

        //Instanciar un constructor largo paso a paso a travez del patron BUILDER
        ConstructorLargo constructorLargo = new ConstructorLargoBuilder("Adrian")
                .conApellido("Coronel").conEdad(19).conDni("73260290").build();

        //Usa la tecnica InLine
        hoyEsDomingo(7);

        System.out.println(esJDKJavaEnWindows());
    }

    private static void imprimeMayorYMenor(int[] numeros) {
        //Primero comenzamos con un if y luego fuimos refactorizando para que se vea más limpio el codigo
        int mayor = Arrays.stream(numeros).reduce(0, (a,b) -> a > b ? a : b);
        int menor = Arrays.stream(numeros).reduce(0, (a,b) -> a < b ? a : b);

        System.out.println("El mayor número es: "+mayor +" y el menor es: "+menor);
    }

    //Esto se conoce como -> Extraer el valor de retorno
    public static int ifAnidado1(){
        int valor1 = 10;
        int valor2 = 10;
        if (valor1 > valor2){
            return valor1;
        } //Consiste en extraer un valor de retorno de un else y así reducir codigo
        return valor2;
    }

    //Tecnica InLINE
    public static void hoyEsDomingo(int numero){
        //Reduje el metodo anterior mediante esta sentencia
        boolean isDomingo = numero == 7;

        if (isDomingo){
            System.out.println("Hoy es Domingo");
        }
    }


    //Tecnica Extraer Variables
    public static boolean esJDKJavaEnWindows() {
        boolean runtimeJDK = System.getProperty("java.runtime.name").contains("Java(TM) SE Runtime Environment");
        boolean osVersion = System.getProperty("os.version").compareTo("10.0") == 0;
        return runtimeJDK && osVersion;
    }
}
