package javaBasico.POO.Ejercicio.entities;

import javaBasico.POO.Ejercicio.abstrasct.Hardware;
import javaBasico.POO.Ejercicio.abstrasct.Middleware;
import javaBasico.POO.Ejercicio.abstrasct.SmartDevice;

public class SmartWatch extends SmartDevice {

    private String modelo;
    private String color;
    private String fabricante;
    private double pulgadas;


    public SmartWatch(Hardware hardware, Middleware middleware) {
        super(hardware, middleware);
    }
    public SmartWatch(Hardware hardware, Middleware middleware, String modelo, String color, String fabricante, double pulgadas) {
        super(hardware, middleware);
        this.modelo = modelo;
        this.color = color;
        this.fabricante = fabricante;
        this.pulgadas = pulgadas;
    }



    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }


    @Override
    public String toString() {
        return "SmartWatch{" +
                "modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", pulgadas=" + pulgadas +
                "} " + super.toString();
    }
}
