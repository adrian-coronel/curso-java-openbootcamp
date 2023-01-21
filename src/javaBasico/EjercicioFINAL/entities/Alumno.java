package javaBasico.EjercicioFINAL.entities;

import javaBasico.EjercicioFINAL.abstracts.SchoolEntities;

public class Alumno extends SchoolEntities {

    private double averageTeoria;
    private double averageLaboratorio;

    public Alumno(){
        super();
    }
    public Alumno(String codigo,String nombre, String apellido, Integer edad, double averageTeoria, double averageLaboratorio) {
        super(codigo,nombre, apellido, edad);
        this.averageTeoria = averageTeoria;
        this.averageLaboratorio = averageLaboratorio;
    }

    public double getFinalAverage(){
        double resultFinal = (0.4 * averageTeoria + averageLaboratorio * 0.6);
        return Math.round(resultFinal*100.0)/100.0;
    }

    public double getAverageTeoria() {
        return averageTeoria;
    }

    public void setAverageTeoria(double notasTeoria) {
        this.averageTeoria = notasTeoria;
    }

    public double getAverageLaboratorio() {
        return averageLaboratorio;
    }

    public void setAverageLaboratorio(double averageLaboratorio) {
        this.averageLaboratorio = averageLaboratorio;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "averageTeoria=" + averageTeoria +
                ", averageLaboratorio=" + averageLaboratorio +
                "} " + super.toString();
    }
}
