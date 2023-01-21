package javaAvanzado.Objetos_DirectivaDeMenorConocimiento.good;

public class FacturaElectricaEmpresa extends FacturaElectrica{

    @Override
    public double calcular() {
        return 0.90 + obtenerImpuesto(0.90);
    }

}
