package javaAvanzado.PrincipioSOLID.L.Problema;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Avion extends Vehiculo{
    @Override
    public void aparcar() {
        throw new NotImplementedException();
    }

    @Override
    public void aterrizar() {
    }

    @Override
    public void despegar() {
    }

    @Override
    public void frenar() {
        throw new NotImplementedException();
    }

    @Override
    public void acelerar() {
        throw new NotImplementedException();
    }
}
