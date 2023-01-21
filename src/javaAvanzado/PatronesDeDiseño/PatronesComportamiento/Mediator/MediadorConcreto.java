package javaAvanzado.PatronesDeDiseño.PatronesComportamiento.Mediator;

import java.util.ArrayList;
import java.util.List;

/**Debido a que no podemos instanciar las clases abstract debo crear una clase
 * para que instancie*/
public class MediadorConcreto extends Mediator{

    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void registra(Colleague colleague) {
        //contains -> Devuelve verdadero si esta lista contiene el elemento especificado.
        if (!colleagues.contains(colleague)){
            colleagues.add(colleague);
            colleague.setMediator(this);//Aqui indico que su MEDIADOR será ESTA CLASE EN ESPECIFICO
        }
    }

    //Esto es parecido al Observer, pero pueden hablar multiples y el que envia no recibe
    @Override
    public void reenviar(Colleague colleague) { // Recibe como parametro al colega que ENVIA
        for (Colleague otros : colleagues) {
            if (!otros.equals(colleague)){ //Esta condición es para que reciban todos menos al que ENVIO el mensaje
                otros.recibe();
            }
        }
    }
}
