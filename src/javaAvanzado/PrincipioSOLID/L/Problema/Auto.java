package javaAvanzado.PrincipioSOLID.L.Problema;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Auto extends Vehiculo{
    @Override
    public void aparcar() {
        // Codigo para aparcar
    }
    @Override
    public void frenar() {
        // Codigo para frenar
    }
    @Override
    public void acelerar() {
        // Codigo para acelerar
    }

    @Override
    public void aterrizar() {
        throw new NotImplementedException();
    }
    /*
     Da una exception porque una bicicle no puede aterrizar ni despegar
     */
    @Override
    public void despegar() {
        throw new NotImplementedException();
    }
}
