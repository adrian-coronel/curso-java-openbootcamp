package javaBasico.POO.Herencia;

public class Vehiculo {

    // 1. atributos

    //private -> MODIFICADOR DE ACCESO
    private String fabricante;
    private String modelo;
    private String año;
    private double velocidad;


    // 2. constructores -> metodos que permiten crear un objeto de una clase
    public Vehiculo(){}
    public Vehiculo(String fabricante, String modelo, String año) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.año = año;
    }

    // 3. métodos (comportamiento)
    public void acelerar(double velocidad){
        this.velocidad=+velocidad;
    }

    // 4. getter and setter
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año='" + año + '\'' +
                '}';
    }
}
