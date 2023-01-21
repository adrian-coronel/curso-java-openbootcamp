package javaAvanzado.PrincipioSOLID.O.Solucion;

import java.util.List;

/**
 * Si el usuario me pide agregar más tipos de reporte, solo tendría que crear una clase
 * que implemente de esta interface y que relize su trabajo en específico.
 * */

public interface IReporteGenerador {

    void crearReporte(List<Orden> ordenes);
}
