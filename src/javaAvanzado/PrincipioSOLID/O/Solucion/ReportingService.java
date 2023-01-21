package javaAvanzado.PrincipioSOLID.O.Solucion;

import java.util.List;

/*
* A esta clase no se le responsabiliza la forma ni el tipo en que se crea
* el reporte, solo recibe la lista de ordenes con las que trabajaran las
* implementaciones de 'IReporteGenerador'
* */
public class ReportingService {
    private IReporteGenerador reporteGenerador;

    public ReportingService(IReporteGenerador reporteGenerador){
        this.reporteGenerador = reporteGenerador;
    }
    public void generarReporte(List<Orden> ordenes){
        reporteGenerador.crearReporte(ordenes);
    }
}

class Orden {

}
