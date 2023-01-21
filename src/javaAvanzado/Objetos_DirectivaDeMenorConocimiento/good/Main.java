package javaAvanzado.Objetos_DirectivaDeMenorConocimiento.good;

public class Main {
    public static void main(String[] args) {

        FacturaElectrica facturaElectricaUsuario = new FacturaElectricaUsuario();
        FacturaElectrica facturaElectricaEmpresa = new FacturaElectricaEmpresa();

        System.out.println(facturaElectricaUsuario.calcular());
        System.out.println(facturaElectricaEmpresa.calcular());

    }
}
