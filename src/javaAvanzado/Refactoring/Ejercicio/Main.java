package javaAvanzado.Refactoring.Ejercicio;

public class Main {
    public static void main(String[] args) {
        Personaje personaje = new Personaje();
        personaje.setEspada("Excalibur");
        personaje.setNivel(10);
        personaje.setNombre("Adrian");

        System.out.println("Daño realizado: " +personaje.atacarConEspada("punzada"));
        System.out.println("Daño realizado: " +personaje.golpear());
        personaje.defenderse();

    }
}
