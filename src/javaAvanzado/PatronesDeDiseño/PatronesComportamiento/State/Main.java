package javaAvanzado.PatronesDeDiseño.PatronesComportamiento.State;

public class Main {
    public static void main(String[] args) {
        Telefono telf = new Telefono();

        System.out.println(telf.estado.tomarFoto());

        System.out.println(telf.estado.desbloquear());
        System.out.println(telf.estado.desbloquear());
        System.out.println(telf.estado.tomarFoto());

        System.out.println("\n-- Entonces habro camará --");

        System.out.println(telf.getEstado().abrirCamara());
        System.out.println(telf.getEstado().tomarFoto());
        System.out.println(telf.getEstado().tomarFoto());


    }
}
