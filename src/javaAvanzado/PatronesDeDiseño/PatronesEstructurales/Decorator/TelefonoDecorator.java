package javaAvanzado.PatronesDeDiseño.PatronesEstructurales.Decorator;


public class TelefonoDecorator implements Telefono{

    private Telefono telefono;

    private TelefonoDecorator(){}
    //Aqui se produce el patron DECORATOR
    public TelefonoDecorator(Telefono telefono){
        //Aqui ingreso la clase de Tipo Telefono
        this.telefono = telefono;
    }

    @Override
    public void crear() {
        //Cuando use el metodo, se usará el metodo de la CLASE INGRESADA EN EL CONSTRUCTOR
        telefono.crear();
    }

}
