package javaBasico.Estructuras_de_control;

public class Ejercicio {
    public static void main(String[] args) {

        String[] textos = {"Hola","mundo","espero se","encuentren bien."};
        String mensaje = "";

        for (String text: textos) {
            mensaje += " " + text;
        }

        System.out.println(mensaje);

    }
}
