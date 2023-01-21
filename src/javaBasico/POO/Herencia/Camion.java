package javaBasico.POO.Herencia;



//Hereda mediante la notación "extends"
public class Camion extends Vehiculo {

    private double capacidadCarga;



    public Camion(){}


    public Camion(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public Camion(String fabricante, String modelo, String año, double capacidadCarga) {
        super(fabricante, modelo, año);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
}
