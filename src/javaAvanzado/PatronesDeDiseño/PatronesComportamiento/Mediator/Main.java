package javaAvanzado.PatronesDeDiseño.PatronesComportamiento.Mediator;

public class Main {
    public static void main(String[] args) {

        Mediator mediador = new MediadorConcreto();

        Colleague colega1 = new ColegaConcreto1();
        Colleague colega2 = new ColegaConcreto2();
        Colleague colega3 = new ColegaConcreto3();

        mediador.registra(colega1);
        mediador.registra(colega2);
        mediador.registra(colega3);

        colega1.enviar();//Envia el mensaje a todos los subscritos, excepto a si mismo

    }
}
