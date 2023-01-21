package javaAvanzado.PrincipioSOLID.I.Problema;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class HamburguesaOrdenService implements IPedidosComidaService{

    @Override
    public void ordenarHamburguesa(int canitdad) {
        //Codigo para ordenar Hamburguesa
    }

    @Override
    public void ordenarFilete(int canitdad) {
        System.out.println( "No puede pedir un Filete en ESTE servicio" );
        throw new NotImplementedException();
    }

    @Override
    public void ordenarEnsalada(int canitdad) {
        System.out.println( "No puede pedir un Ensalada en ESTE servicio" );
        throw new NotImplementedException();
    }

}
