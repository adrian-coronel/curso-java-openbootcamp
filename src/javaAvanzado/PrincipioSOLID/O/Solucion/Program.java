package javaAvanzado.PrincipioSOLID.O.Solucion;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Orden> ordenes = new ArrayList<>();

        /** Aqui es donde decidimos el tipo de formato que vamos a generar */
        ReportingService service = new ReportingService( new ReporteGeneradorPDF() );
        service.generarReporte(ordenes);

    }
}
