package javaBasico.Concepto.company.views;

import javaBasico.Concepto.company.abstracts.Coche;
import javaBasico.Concepto.company.entities.CocheServiceClasicoImpl;
import javaBasico.Concepto.company.entities.CocheServiceDeportivoImpl;
import javaBasico.Concepto.company.interfaces.CocheService;

public class InterfacesMain {
    public static void main(String[] args) {

        //Aqui estamos aplicando POLIMORFISMO sobre interfaces
        CocheService service1 = new CocheServiceClasicoImpl();
        CocheService service2 = new CocheServiceDeportivoImpl();

        //Aqui podemos ver el mismo metodo, pero tienen diferente cuerpo
        Coche coche1 = service1.crearCocheDemo();
        Coche coche2 = service2.crearCocheDemo();

        /*EJEMPLO DE COMO SE PUEDE APLICAR:
        *
        *Cuando trabajamos con Bases de Datos, podriamos tener una interface que contenga
        *las operaciones que se van a realizar y una IMPLEMENTACIÓN sería una implementacion
        *para una Base de Datos CONCRETA*/

    }
}
