package javaBasico.Eventos_XML_JSON.Patron_Observer;

import java.util.ArrayList;

interface Mensajero{
    void hanSaludado();
}

class Receptor implements Mensajero{
    @Override
    public void hanSaludado() {
        System.out.println("Hola Emisor!! Soy un Receptor");
    }
}

class ReceptorMusical implements Mensajero{
    @Override
    public void hanSaludado() {
        System.out.println("Hola Emisor!! Soy un receptor musical");
    }
}

class Emisor {
    //El arrayList contrendra CLASES que implementen a la INTERFAZ "Mensajero"
    private ArrayList<Mensajero> receptores = new ArrayList<>();

    public void meteReceptor(Mensajero receptor){
        receptores.add(receptor);
    }

    public void saluda() {
        System.out.println("Hola receptores");
        for (Mensajero mj : receptores){
            mj.hanSaludado();//invoca el metodo hanSaludado en tod0s los receptores
        }
    }
}

public class Main {
    public static void main(String[] args) {
        /**
         * La analogía consiste en que podemos tener un solo EMISOR(emitir mensajes) que
         * genere un mismo evento para todos los RECEPTORES(recibir mensajes)
         *
         * Relación de UNO a MUCHOS
         * */
        Emisor emisor = new Emisor();
        Mensajero receptor = new Receptor();
        Mensajero receptorMusical = new ReceptorMusical();

        emisor.meteReceptor(receptor); //Ejemplo de como se suscriben
        emisor.meteReceptor(receptorMusical); //Ejemplo de como se suscriben

        emisor.saluda();
        /* El emisor manda un mensaje y este les llega a todos los receptores
         * que se han suscrito al emisor.
         */
    }
}
