package javaAvanzado.PrincipioSOLID.L.Solucion;

/*
* De esta forma es como cumplimos el principio de sustitución de Liskov
* pues le damos a cada clase la función que puede cumplir
* */

public class Bicicleta implements IAcelerar,IAparcar,IFrenar{
    @Override
    public void acelerar() {

    }

    @Override
    public void aparcar() {

    }

    @Override
    public void frenar() {

    }
}
