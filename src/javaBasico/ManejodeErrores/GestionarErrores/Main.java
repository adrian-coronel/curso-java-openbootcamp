package javaBasico.ManejodeErrores.GestionarErrores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce dos números");

        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();
        try{ //Aqui ponemos el codigo que puede disparar una Exception
            int resultado = numeroA / numeroB;
            System.out.println(numeroA +" / "+numeroB+" = "+resultado);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }/**Puedo gestionar las excepciones ESPECIFICAMENTE, si quiero realizar ALGO cuando
         se presente una Exception en concreto*/
        finally {
            System.out.println("finally");
        }

    }
}
