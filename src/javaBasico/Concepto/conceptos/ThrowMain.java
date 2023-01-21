package javaBasico.Concepto.conceptos;

import java.util.Scanner;

//VAMOS A VER COMO LANZAR NUESTRAS PROPIAS EXCEPSIONES
public class ThrowMain {
    public static void main(String[] args) {
        try{
            leerNombres();
        }catch (NameFormatException e){
            e.printStackTrace();
        }
    }

    /**
    * Metodo que lee nombres de consola y verifica que tengan longitud igual o
    * mayor que 8 caracteres
    * @throws NameFormatException
    * */
    //"throws" es la asignatura en el metodo para indicar que se lanzará una exception
    //"throw" es para lanzarla
    private static void leerNombres() throws NameFormatException{

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        while(teclado.hasNext()){
            System.out.println("Introduce un nombre");
            String nombre = teclado.nextLine();
            if(nombre.length() < 8){
                teclado.close();
                throw new NameFormatException("El nombre debe contener mínimo 8 caracteres");
            }//Si es la longitud es menor  a 8 lanzará una EXCEPTION
        }
        teclado.close();
    }
}
