package javaBasico.Concepto.company.views;

import javaBasico.Concepto.company.abstracts.Coche;
import javaBasico.Concepto.company.entities.CocheElectrico;
import javaBasico.Concepto.company.entities.CocheHibrido;

import java.util.ArrayList;
import java.util.List;

public class PolimorfismoMain {
    public static void main(String[] args) {

        //SIN POLIMORFISMO
        CocheElectrico cocheElectrico = new CocheElectrico();
        CocheHibrido cocheHibrido = new CocheHibrido();

        //CON POLIMORFISMO (Usar el tipo BASE)
        Coche cocheElectricoP = new CocheElectrico();
        Coche cocheHibridoP = new CocheHibrido();

        //"instanceof" es para comprobar si esto es una instancia de una Clase
        if(cocheElectricoP instanceof Coche){
            System.out.println("Es un coche");
        }
        if(cocheElectricoP instanceof CocheElectrico){
            System.out.println("Es un coche Electrico");
        }
        if(cocheElectricoP instanceof CocheHibrido){
            System.out.println("Es un coche Hibrido");
        }

        /*La diferencia es -> Cuando no utilizamos POLIMORFISMO trabajamos con los TIPOS concretos,
        * en cambio si lo usamos, lo empleamos de manera genera.
        *
        * Esto nos permitira más adelante trabajar con estructuras de datos o Arrays del tipo COCHE, ya que si tenemos 5 tipos
        * de coches de diferente tipo no tendriamos como especificar el TIPO en una sola lista*/

        List<Coche> listaCoches = new ArrayList<>();
        listaCoches.add(cocheElectricoP);
        listaCoches.add(cocheHibridoP);
    }
}
