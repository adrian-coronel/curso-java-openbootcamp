package javaBasico.EjercicioFINAL.entities;

import javaBasico.EjercicioFINAL.abstracts.SchoolEntities;

public class Docente extends SchoolEntities {

    private String area;

    public Docente() {
        super();
    }

    public Docente(String codigo,String nombre, String apellido, Integer edad, String area) {
        super(codigo,nombre, apellido, edad);
        this.area = area;
    }

    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "area='" + area + '\'' +
                "} " + super.toString();
    }
}
