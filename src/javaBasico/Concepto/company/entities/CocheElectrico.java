package javaBasico.Concepto.company.entities;

import javaBasico.Concepto.company.abstracts.Coche;

public class CocheElectrico extends Coche {

    private String motorElectrico;

    //Constructores
    public CocheElectrico(){}

    public CocheElectrico(String motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    public CocheElectrico(String color, String fabricante, String modelo, double peso, double largo, String motorElectrico){
        super(color, fabricante, modelo, peso, largo);//Super me permite invocar el constructor de la clase superior
        this.motorElectrico = motorElectrico;
    }



    //Evento de SOBREESCRITURA
    @Override //Override -> Indica al compilador si existe este metodo en la case superior
    public void acelerar(int cantidad) {
        int cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada);
    }



    //Getter and Setter
    public String getMotorElectrico() {
        return motorElectrico;
    }

    public void setMotorElectrico(String motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                "} " + super.toString();
    }
}
