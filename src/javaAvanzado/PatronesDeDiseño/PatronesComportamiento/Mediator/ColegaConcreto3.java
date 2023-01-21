package javaAvanzado.PatronesDeDiseño.PatronesComportamiento.Mediator;

public class ColegaConcreto3 extends Colleague{

    @Override
    public void recibe() {
        System.out.println("ColegaConcreto3 recibio el mensaje");
    }

    @Override
    public void enviar() {
        System.out.println("ColegaConcreto3 envio un mensaje");
        mediator.reenviar(this);
    }

}
