package javaAvanzado.PatronesDeDiseño.PatronesEstructurales.Decorator;

public class TelefonoNextGeneracion extends TelefonoDecorator{

    public TelefonoNextGeneracion(Telefono telefono) {
        super(telefono);
    }

    @Override
    public void crear(){
        super.crear();
        System.out.println("TelefonoNextGeneracion -> Tengo ahora 5G y 1TB");
    }

}
