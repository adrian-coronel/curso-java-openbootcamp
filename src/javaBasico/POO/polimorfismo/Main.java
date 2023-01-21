package javaBasico.POO.polimorfismo;


import javaBasico.POO.Herencia.Camion;
import javaBasico.POO.Herencia.Moto;
import javaBasico.POO.Herencia.Vehiculo;

public class Main {
    public static void main(String[] args) {

        // Polimorfismo
        Vehiculo moto = new Moto();
        moto.acelerar(50);

        Vehiculo camion = new Camion();
        moto.acelerar(50);

        //Da la misma orden a objetos para que respondan con diferentes maneras.

    }
}
