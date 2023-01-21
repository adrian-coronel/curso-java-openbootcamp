package javaBasico.Concepto.conceptos;

public class StringMain {
    public static void main(String[] args) {

        //La clase String

        /*
        * length()
        * starsWith("")
        * indexOf("")
        * subString(1,5)
        * trim()
        * equals()
        * compareTo
        * */

        String mensaje = "  Hola mundo  ";

        //Longitud de la cadena:
        System.out.println(mensaje.length());

        //Mensaje en mayúsculas:
        System.out.println(mensaje.toUpperCase());

        //Cadena con espacios al inicio y final eliminados:
        System.out.println(mensaje.trim());

        String mensaje2 = "Hello Word";
        //Comparar si son iguales
        System.out.println(mensaje.equals(mensaje2));

        String mensaje2MAY = mensaje2.toUpperCase();
        //Comparar si son iguales sin importar las MAYUSCULAS
        System.out.println(mensaje2.equalsIgnoreCase(mensaje2MAY));

    }
}
