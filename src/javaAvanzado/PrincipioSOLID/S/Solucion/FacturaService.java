package javaAvanzado.PrincipioSOLID.S.Solucion;

import javaAvanzado.PrincipioSOLID.S.Problema.OrdenService;

interface IFacturaService {
    Factura crearFactura(Orden orden);
}

public class FacturaService implements IFacturaService{
    @Override
    public Factura crearFactura(Orden orden) {
        //Codigo para crear una factura apartir de la Orden
        return new Factura();
    }
}
