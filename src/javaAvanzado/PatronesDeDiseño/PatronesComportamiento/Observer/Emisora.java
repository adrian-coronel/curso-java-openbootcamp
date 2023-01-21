package javaAvanzado.PatronesDeDiseño.PatronesComportamiento.Observer;

import java.util.ArrayList;
import java.util.List;

public class Emisora {

    private List<Receptor> receptors = new ArrayList<>();

    public void meterReceptor(Receptor receptor){
        receptors.add(receptor);
    }

    public void emite(){

        for (Receptor receptor : receptors) {
            receptor.recibe();
        }

    }

}
