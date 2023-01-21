package javaAvanzado.PatronesDeDiseño.PatronesComportamiento.Mediator;

public class ColegaConcreto2 extends Colleague{
    @Override
    public void recibe() {
        System.out.println("ColegaConcreto2 recibio el mensaje");
    }

    @Override
    public void enviar() {
        System.out.println("ColegaConcreto2 envio un mensaje");
        mediator.reenviar(this);
    }
}
