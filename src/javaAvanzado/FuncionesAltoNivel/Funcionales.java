package javaAvanzado.FuncionesAltoNivel;

import java.util.function.Function;

public class Funcionales {


    //Que tipo de parametro aceptaré y que tipo devolvere -> Function<>
    private static Function<String,String> toMayus = (text) -> text.toUpperCase();
    private static Function<Integer,Integer> sumador = (num) -> num.sum(num,num);
    private static Function<String,Integer> stringToInteger = (str) -> Integer.parseInt(str);

    public void pruebas(){
        //Cuando llamo a la funcion pruebas, se ejecutan las funiones de alto nivel, se ejecutan
        System.out.println(toMayus.apply("adrian"));
        System.out.println(sumador.apply(5));
        System.out.println(stringToInteger.apply("100"));
    }

    public void pruebas2(String name, String edad){
        System.out.println("Nombre en mayuscula: "+ Saludar(toMayus,name));;
        System.out.println("Edad sumado en dies: "+ (StringToInteger(stringToInteger,edad) + 10));
    }

    //Una funcion que llama a otra funcion(Tener una funcion como parametro)
    public String Saludar(Function<String,String> miFuncion, String nombre){// (Funcion, String)
        return miFuncion.apply(nombre);
    }
    public Integer StringToInteger(Function<String,Integer> function, String number){
        return function.apply(number);
    }

}
