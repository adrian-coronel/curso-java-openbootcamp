package javaBasico.Concepto.conceptos;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        String name = scanner.nextLine();
        System.out.println("Introduce tu apellido");
        String lastName = scanner.nextLine();
        System.out.println("Introduce tu edad");
        int age = scanner.nextInt();

        System.out.println();
    }
}
