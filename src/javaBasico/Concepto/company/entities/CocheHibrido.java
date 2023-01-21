package javaBasico.Concepto.company.entities;

import javaBasico.Concepto.company.abstracts.Coche;

public class CocheHibrido extends Coche {

    private String motorHibrido;

    public CocheHibrido(){}

    @Override
    public String toString() {
        return "CocheHibrido{" +
                "motorHibrido='" + motorHibrido + '\'' +
                "} " + super.toString();
    }
}
