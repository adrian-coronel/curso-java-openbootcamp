package javaBasico.Concepto.company.entities;

import javaBasico.Concepto.company.abstracts.Coche;
import javaBasico.Concepto.company.interfaces.CocheService;

public class CocheServiceDeportivoImpl implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("CREANDO COCHE DEPORTIVO");
        return new CocheHibrido();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("DESTRUYENDO COCHE DEPORTIVO");
    }
}
