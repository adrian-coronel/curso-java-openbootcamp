package javaAvanzado.PrincipioSOLID.D.Solucion;

import javaAvanzado.PrincipioSOLID.D.Problema.Orden;

public class Program {
    public static void main(String[] args) {

        // Aqui es DONDE DEFINIMOS EL SERVICIO DE MONITOREAR QUE USAREMOS
        OrdenService service = new OrdenService(new DataDogService());
        service.generarOrden(new Orden());

    }
}
