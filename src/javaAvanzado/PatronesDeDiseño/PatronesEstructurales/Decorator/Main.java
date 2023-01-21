package javaAvanzado.PatronesDeDiseño.PatronesEstructurales.Decorator;

public class Main {
    public static void main(String[] args) {

        /*TelefonoBasico telefonoBasico = new TelefonoBasico();
        telefonoBasico.crear();*/

        TelefonoInteligente telefInteligente = new TelefonoInteligente(new TelefonoBasico());
        telefInteligente.crear();

        System.out.println();
        TelefonoNextGeneracion telefNextGen2 = new TelefonoNextGeneracion(new TelefonoBasico());
        telefNextGen2.crear();

        System.out.println();
        TelefonoNextGeneracion telefNextGen = new TelefonoNextGeneracion(
                new TelefonoInteligente(
                        new TelefonoBasico())
        );
        telefNextGen.crear();
    }
}
