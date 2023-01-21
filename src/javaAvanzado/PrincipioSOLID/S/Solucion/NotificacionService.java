package javaAvanzado.PrincipioSOLID.S.Solucion;

interface INotificacionService {
    boolean emailFactura(Factura factura);
}

public class NotificacionService implements INotificacionService{
    @Override
    public boolean emailFactura(Factura factura) {
        //Codigo para enviar un email de la Factura al usuario
        return true;
    }
}
