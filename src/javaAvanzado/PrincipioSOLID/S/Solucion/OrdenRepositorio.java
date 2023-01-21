package javaAvanzado.PrincipioSOLID.S.Solucion;

interface IOrdenRepositorio{
    boolean insertarOrden(Orden orden);
}

public class OrdenRepositorio implements IOrdenRepositorio{


    @Override
    public boolean insertarOrden(Orden orden) {
        // Codigo de inserción de la orden en la base de datos
        return true;
    }
}
