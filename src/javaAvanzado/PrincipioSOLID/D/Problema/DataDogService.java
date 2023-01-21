package javaAvanzado.PrincipioSOLID.D.Problema;
/*
* DataDog es un servicio de monitoreo de aplicaciones, desde nuestra aplicaciones
* podemos hacer que un loggin en vez que vaya a un archivo de texto, vaya a DataDog
* */
public class DataDogService {

    public void LoginEvento(String mensaje){
        //Codigo para un evento en DataDog
    }

}

class OrdenService {
    /**
     * Aqui el problema es que si algún día cambiamos el servicio de DataDog
     * por otro, tendría que modificar esta clase, cuando no tiene sentido, pues
     * el 'LoginEvento()' no cambia, solo cambia a donde se enviará el LOGIN, es por ello
     * que es mejor depender de una abstracción y no de la clase concreta
     * */
    public DataDogService dataDogService;

    public OrdenService(DataDogService dataDogService){
        this.dataDogService = dataDogService;
    }

    public void generarOrden(Orden orden){
        // TODO: código para crear la orden

        // Enviar notificación a DataDog
        dataDogService.LoginEvento("La orden fue creada con éxito");
    }
}

