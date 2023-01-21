package javaBasico.Entrada_Salida.Scanner;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            InputStream fichero2 = new FileInputStream("MiFile.txt");
            /**Scanner resive como parametro un InputStream, por eso puedo pasarle "fichero2"*/
            Scanner scanner = new Scanner(fichero2);
            scanner.next();//Bloquea la ejecución del programa hasta que se pacen los datos

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        prueba();
    }

    public static void prueba(){
        try{

            boolean ok = false; // -> Se conoce como la tecnica del PLAG
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Ingresa 2 números");
                try{
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    ok = true;
                } catch (InputMismatchException e){
                    System.out.println(e.getMessage());
                }

            } while (!ok);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }


}
