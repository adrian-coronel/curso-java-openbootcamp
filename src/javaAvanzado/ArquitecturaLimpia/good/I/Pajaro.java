package javaAvanzado.ArquitecturaLimpia.good.I;

public class Pajaro implements AnimalVolador {
    @Override
    public boolean beber() {
        return false;
    }

    @Override
    public boolean volar() {
        return false;
    }
}
