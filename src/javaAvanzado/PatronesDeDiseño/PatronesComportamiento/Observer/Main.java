package javaAvanzado.PatronesDeDiseño.PatronesComportamiento.Observer;

public class Main {
    public static void main(String[] args) {

        Satelite satelite = new Satelite();
        ReceptorTV Tv = new ReceptorTV();

        Emisora emisora = new Emisora();
        emisora.meterReceptor(satelite);
        emisora.meterReceptor(Tv);

        emisora.emite();
    }
}
