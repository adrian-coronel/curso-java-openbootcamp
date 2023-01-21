package javaBasico.TiposdeDatosAvanzados.String;

public class Main {
    public static void main(String[] args) {

        String cadena = "Mensaje de texto";
        String mayusculas = "MENSAJE DE TEXTO";
        String minusculas = "mensaje de texto";

        // Longitud de la cadena
        int cadenaLeng = cadena.length();
        System.out.println("Longitud de la cadena: "+ cadenaLeng);

        // Convertir a Minuscula
        String cadenaMINUS = mayusculas.toLowerCase();
        System.out.println("Original: "+mayusculas+ " Convertido: " +cadenaMINUS);

        // Convertir a Mayuscula
        String cadenaMAYUS = minusculas.toUpperCase();
        System.out.println("Original: "+minusculas+ " Convertido: " +cadenaMAYUS);

        // Saber si la cadena comienza con un texto
        boolean resultado = cadena.startsWith("Men");
        System.out.println("¿Empiza por 'Men'? " + resultado);

        // Saber si la cadena termina con un texto
        boolean resultado2 = cadena.endsWith("texto");
        System.out.println("¿Termina con 'texto'? " + resultado2);

        // Obtener un caracter en la cadena
        char letra = cadena.charAt(2);
        System.out.println("El caracter en la posicion 2 es: " +letra);

        recorrerCadena("Hola mundo");
        System.out.println(voltearCadena("Adrian"));;


    }

    /**
     * Una cadena es un Array de caracteres
     * */
    public static void recorrerCadena(String texto){
        for (int i = 0 ; i < texto.length() ; i++){
            System.out.println(texto.charAt(i));
        }
    }

    public static String voltearCadena(String texto){
        String cadena = "";
        for (int i = texto.length()-1 ; i >= 0 ; i--){
            cadena += texto.charAt(i);
        }
        return cadena;
    }
}
