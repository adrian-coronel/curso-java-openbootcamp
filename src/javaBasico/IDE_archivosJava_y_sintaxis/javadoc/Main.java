package javaBasico.IDE_archivosJava_y_sintaxis.javadoc;

/**Clase para probar JavaDoc*/
public class Main {
    public static void main(String[] args) {

        //Si me pongo encima del metodo, observare la descripción que cree
        sumar(10d,27d);
    }


    /**
     * Este es un metodo para sumar los valores ingresados en
     * el parametro
     *
     * */
    public static double sumar(double a, double b){
        return a + b;
    }
}
