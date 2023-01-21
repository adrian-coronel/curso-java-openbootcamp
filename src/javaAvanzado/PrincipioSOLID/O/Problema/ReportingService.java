package javaAvanzado.PrincipioSOLID.O.Problema;

import java.util.List;

public class ReportingService {

    public void generarReporte(List<Orden> ordenes, String tipo){
        // Generar codigo para crear el reporte

        // Conversión específica dependiendo del tipo
        if (tipo.equals(TipoReporte.PDF)){
            crearPDFReporte(ordenes);
        } else if (tipo.equals(TipoReporte.EXCEL)) {
            crearExcelReporte(ordenes);
        } else if (tipo.equals(TipoReporte.JSON)) {
            crearJsonReporte(ordenes);
        }
        /*
        * Aqui el problema es que por ejemplo si el usuario nos pide agregar un nuevo
        * tipo de reporte, como lo sería XML, tendríamos que MODIFICAR esta clase y
        * por ejemplo, crear un nuevo metodo 'crearXMLReporte(...)' y otro ELSE-IF
        * De esta manera estaríamos rompiendo el principio ABIERTO-CERRADO
        * */
    }

    public void crearPDFReporte(List<Orden> ordenes){
        // Crear PDF Reporte
    }
    public void crearExcelReporte(List<Orden> ordenes){
        // Crear Excel Reporte
    }
    public void crearJsonReporte(List<Orden> ordenes){
        // Crear Json Reporte
    }

}

class Orden {

}

class TipoReporte {
    static String PDF;
    static String EXCEL;
    static String JSON;
}