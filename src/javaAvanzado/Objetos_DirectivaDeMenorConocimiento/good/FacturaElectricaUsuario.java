package javaAvanzado.Objetos_DirectivaDeMenorConocimiento.good;

public class FacturaElectricaUsuario extends FacturaElectrica{

    @Override
    public double calcular() {
        return 0.55 + obtenerImpuesto(0.55);
    }

}
