package javaBasico.Concepto.company.interfaces;

import javaBasico.Concepto.company.abstracts.Coche;

public interface CocheService {

    /*Una interface es un CONTRATO de que es lo "que hay que hacer" y la
    * CLASE que lo implemente difinira "como se va a hacer"
    *
    * Las clases que implementen las interfaces están obligadas a darle cuerpo
    * a los métodos*/


    public Coche crearCocheDemo();

    public void destruirCoche(Coche coche);
}
