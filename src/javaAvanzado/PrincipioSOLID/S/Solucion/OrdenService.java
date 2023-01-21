package javaAvanzado.PrincipioSOLID.S.Solucion;

/*
* Ahora la responsabilidad de nuestro OrdenService es conectar los
* demás servicios.
* */
public class OrdenService {
    private IOrdenRepositorio ordenRepositorio;
    private INotificacionService notificacionService;
    private IFacturaService facturaService;

    // Constructor que recibe las dependencias
    public OrdenService(IOrdenRepositorio ordenRepositorio,
                        INotificacionService notificacionService,
                        IFacturaService facturaService){
        this.ordenRepositorio = ordenRepositorio;
        this.notificacionService = notificacionService;
        this.facturaService = facturaService;
    }

    public void guardarOrden(Orden orden){
        try {
            /*
            * Si nos damos cuenta esta clase se desprende de las otras responsabilidades,
            * no le importa el repositorio inserte la orden en la BD, no le importa como se cree
            * la factura ni como se envie el email, solo cumple con su responsabilidad.
            * */
            ordenRepositorio.insertarOrden(orden);
            Factura factura = facturaService.crearFactura(orden);
            notificacionService.emailFactura(factura);
        } catch (Exception e){
            e.getMessage();
        }
    }

}
