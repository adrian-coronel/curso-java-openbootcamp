package javaAvanzado.PatronesDeDiseño.PatronesComportamiento.Mediator;

public class ColegaConcreto1 extends Colleague{



    @Override
    public void recibe() {
        System.out.println("ColegaConcreto1 recibio el mensaje");
    }

    @Override
    public void enviar() {
        System.out.println("ColegaConcreto1 envio un mensaje");
        mediator.reenviar(this); //Mediante este sabemos quien envia
    }
}
