package javaBasico.Funciones;

public class ejercicio2 {
    public static void main(String[] args) {
        System.out.println(getPriceIva(100.00));
    }

    public static double getPriceIva(double setPrice){
        return setPrice + setPrice * 0.18;
    }

}
