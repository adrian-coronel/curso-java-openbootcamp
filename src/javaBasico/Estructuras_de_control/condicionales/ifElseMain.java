package javaBasico.Estructuras_de_control.condicionales;

public class ifElseMain {
    public static void main(String[] args) {

        //Si quiero reformar el archivo entrar: en la barra de arribe "code" => reformat File => Whole file y run

        int edad = 19;
        boolean esMayor = edad >= 18;

        if (esMayor) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}
