package javaAvanzado.PatronesDeDiseño.PatronesEstructurales.Decorator;

// En esta clase CREO los DECORADORES
public class TelefonoInteligente extends TelefonoDecorator {

    public TelefonoInteligente(Telefono telefono) {
        super(telefono);
    }

    @Override
    public void crear(){
        super.crear(); // Este metodo de la clase que se pase en el PARAMTRO DEL PADRE
        System.out.println("TelefonoInteligente -> Tengo ahora 4G");
    }
}
