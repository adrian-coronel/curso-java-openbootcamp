package javaAvanzado.PatronesDeDiseño.PatronesCreacionales.Builder;

public class Vehiculo {

    public String marca;
    public String tipo;
    public String motor;
    public int puertas;


    public String getMarca() {
        return marca;
    }
    public String getTipo() {
        return tipo;
    }
    public String getMotor() {
        return motor;
    }
    public int getPuertas() {
        return puertas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", motor='" + motor + '\'' +
                ", puertas=" + puertas +
                '}';
    }
}
