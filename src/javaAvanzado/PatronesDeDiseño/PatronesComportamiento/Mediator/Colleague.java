package javaAvanzado.PatronesDeDiseño.PatronesComportamiento.Mediator;

/** Colleague -> Colega
 * Las clases abstractas permiten tener metodos sin codigo implementado y
 * otros con codigo implementado
 * */

public abstract class Colleague {

    public Mediator mediator;

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void recibe();
    public abstract void enviar();
}
