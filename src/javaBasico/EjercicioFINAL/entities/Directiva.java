package javaBasico.EjercicioFINAL.entities;

import javaBasico.EjercicioFINAL.abstracts.SchoolEntities;

public class Directiva extends SchoolEntities {

    private String cargo;

    public Directiva(String cargo) {
        super();
    }
    public Directiva(String codigo,String nombre, String apellido, Integer edad, String cargo) {
        super(codigo,nombre, apellido, edad);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Directiva{" +
                "cargo='" + cargo + '\'' +
                "} " + super.toString();
    }
}
