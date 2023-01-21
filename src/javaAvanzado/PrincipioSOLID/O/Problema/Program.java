package javaAvanzado.PrincipioSOLID.O.Problema;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Orden> ordenes = new ArrayList<>();

        ReportingService service = new ReportingService();
        service.generarReporte(ordenes, TipoReporte.PDF);
    }
}
