package javaBasico.Concepto.company.entities;

import javaBasico.Concepto.company.abstracts.Coche;
import javaBasico.Concepto.company.interfaces.CocheService;

public class CocheServiceClasicoImpl implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("CREANDO COCHE CLASICO");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("DESTRUYENDO COCHE CLASICO");
    }

}
