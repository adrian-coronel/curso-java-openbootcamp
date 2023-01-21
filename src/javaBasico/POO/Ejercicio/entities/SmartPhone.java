package javaBasico.POO.Ejercicio.entities;

import javaBasico.POO.Ejercicio.abstrasct.Hardware;
import javaBasico.POO.Ejercicio.abstrasct.Middleware;
import javaBasico.POO.Ejercicio.abstrasct.SmartDevice;

public class SmartPhone extends SmartDevice {

    private String pantalla;
    private String fabricante;
    private String bateria;
    private String procesador;
    private double peso;


    public SmartPhone() {
    }

    public SmartPhone(Hardware hardware, Middleware middleware, String pantalla, String fabricante, String bateria, String procesador, double peso) {
        super(hardware, middleware);
        this.pantalla = pantalla;
        this.fabricante = fabricante;
        this.bateria = bateria;
        this.procesador = procesador;
        this.peso = peso;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    @Override
    public String toString() {
        return "SmartPhone{" +
                "pantalla='" + pantalla + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", bateria='" + bateria + '\'' +
                ", procesador='" + procesador + '\'' +
                ", peso=" + peso +
                "} " + super.toString();
    }
}
