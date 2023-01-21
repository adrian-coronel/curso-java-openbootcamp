package javaBasico.Funciones;

public class FuncionesAnonimas {
    public static void main(String[] args) {

        //Es como pasar una función a otra función
        Runnable hola_mundo = () -> System.out.println("Hola mundo");
        hola_mundo.run();

    }


}
