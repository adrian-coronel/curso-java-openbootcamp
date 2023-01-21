package javaAvanzado.Objetos_DirectivaDeMenorConocimiento.bad;

public class FacturaElectrica {

    double impuesto = 21;

    public double obtenerImpuesto(double precio){
        return precio * impuesto / 100;
    }

    //Aqui vemos que estos dos metodos se pueden Abstraer
    public double calcularPrecioUsuario(){
        return 0.55 + obtenerImpuesto(0.55);
    }

    public double calclularPrecioEmpresa(){
        return 0.90 + obtenerImpuesto(0.90);
    }

}
