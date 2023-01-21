package javaBasico.Concepto.conceptos;

public class SwitchCase {
    public static void main(String[] args) {

        String mes = "Agosto";

        switch (mes){
            case "Enero":
                System.out.println("El mes es Diciembre");
                break;
            case "Febrero":
                System.out.println("El mes es Febrero");
                break;
            case "Agosto":
                System.out.println("El mes es Agosto");
                break;
            default:
                System.out.println("El mes no existe");

        }


        int numero = 70;

        switch (numero){
            case 12:
                System.out.println("El numero es 12");
                break;
            case 77:
                System.out.println("El numero es 77");
                break;
            case 70:
                System.out.println("El numero es 70");
                break;
            default:
                System.out.println("El numero no se encuentra");
        }

    }
}
