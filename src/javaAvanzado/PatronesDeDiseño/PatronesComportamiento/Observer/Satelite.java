package javaAvanzado.PatronesDeDiseño.PatronesComportamiento.Observer;

public class Satelite implements Receptor{
    @Override
    public void recibe() {
        System.out.println("Señal recibida en SATELITE");
    }
}
