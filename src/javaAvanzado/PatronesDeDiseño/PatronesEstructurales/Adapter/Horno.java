package javaAvanzado.PatronesDeDiseño.PatronesEstructurales.Adapter;

public class Horno implements Enchufable{
    private boolean encendido = false;

    @Override
    public void enciende() {
        encendido = true;
    }

    @Override
    public void apaga() {
        encendido = false;
    }

    @Override
    public boolean estaEncendido() {
        return encendido;
    }
}
