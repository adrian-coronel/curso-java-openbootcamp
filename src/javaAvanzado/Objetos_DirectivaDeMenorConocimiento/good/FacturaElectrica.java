package javaAvanzado.Objetos_DirectivaDeMenorConocimiento.good;

public abstract class FacturaElectrica {
    double impuesto = 21;

    //Metodo concreto
    public double obtenerImpuesto(double precio) {
        return precio * impuesto / 100;
    }

    public abstract double calcular();
}
