package javaBasico.POO.Herencia;


public class Moto extends Vehiculo {

    private String Motor;



    public Moto(){}

    public Moto(String motor) {
        Motor = motor;
    }




    public Moto(String fabricante, String modelo, String año, String motor) {
        super(fabricante, modelo, año);
        Motor = motor;
    }

    public String getMotor() {
        return Motor;
    }

    public void setMotor(String motor) {
        Motor = motor;
    }
}
