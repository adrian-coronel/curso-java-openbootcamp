package javaAvanzado.PatronesDeDiseño.PatronesComportamiento.Observer;

public class ReceptorRadio implements Receptor{
    @Override
    public void recibe() {
        System.out.println("Señal recibida en la ReceptorRadio");
    }
}
