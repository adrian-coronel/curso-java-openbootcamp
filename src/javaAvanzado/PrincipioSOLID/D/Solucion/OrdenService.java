package javaAvanzado.PrincipioSOLID.D.Solucion;

import javaAvanzado.PrincipioSOLID.D.Problema.Orden;

public class OrdenService {
    public IEventoNotificacionService eventoNotificacionService;
    /**
     * La diferencia es que ahora esta clase depende de la abstracción y si quiero cambiar
     * a otro servicio que no sea DataDog, solo tendré que crear otra clase con la implementación,
     * sin necesidad de tocar esta clase.
     * */

    public OrdenService(IEventoNotificacionService eventoNotificacionService){
        this.eventoNotificacionService = eventoNotificacionService;
    }

    public void generarOrden(Orden orden){
        // TODO: código para crear la orden

        // Enviar notificación a DONDE LA TENGA QUE ENVIAR
        eventoNotificacionService.LoginEvento("La orden fue creada con éxito");
    }
}
