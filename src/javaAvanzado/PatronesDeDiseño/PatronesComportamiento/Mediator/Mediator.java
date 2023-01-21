package javaAvanzado.PatronesDeDiseño.PatronesComportamiento.Mediator;

public abstract class Mediator {

    public abstract void registra(Colleague colleague); //Recibe un colega
    public abstract void reenviar(Colleague colleague); //Reenvia a un colega

}
