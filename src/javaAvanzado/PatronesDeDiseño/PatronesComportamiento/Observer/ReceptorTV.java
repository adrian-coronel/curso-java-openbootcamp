package javaAvanzado.PatronesDeDiseño.PatronesComportamiento.Observer;

public class ReceptorTV implements Receptor{
    @Override
    public void recibe() {
        System.out.println("Señal recibida en ReceptorTV");
    }
}
