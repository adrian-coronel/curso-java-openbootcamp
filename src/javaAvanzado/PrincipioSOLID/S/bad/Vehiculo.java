package javaAvanzado.PrincipioSOLID.S.bad;

public class Vehiculo {

    private int velocidad;

    public void acelerar(){
        velocidad++;
    }

    public void frenar(){
        velocidad--;
    }

    public int getVelocidad() {
        return velocidad;
    }

    // Aqui es donde rompemos el principio, ya que "echarGasolina" es una gestion diferente
    public void echarGasolina(){

    }
}
