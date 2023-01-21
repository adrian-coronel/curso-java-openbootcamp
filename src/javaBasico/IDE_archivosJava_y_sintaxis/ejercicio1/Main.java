package javaBasico.IDE_archivosJava_y_sintaxis.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setFirstName("Adrian");
        persona.setLastName("Coronel");
        persona.setAge(19);
        persona.setHeight(1.70);
        persona.setWeight(110.00);

        persona.imprimir();
    }
}
