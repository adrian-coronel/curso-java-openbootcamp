package javaAvanzado.ArquitecturaLimpia.good.I;

public class Perro implements AnimalTerrestre {

    @Override
    public boolean comer() {
        return false;
    }

    @Override
    public boolean correr() {
        return false;
    }
}
