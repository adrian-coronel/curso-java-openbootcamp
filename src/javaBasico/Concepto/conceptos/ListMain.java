package javaBasico.Concepto.conceptos;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        //List es una interface

        List<String> listaNombres = new ArrayList<>();
        listaNombres.add("Adrian");
        listaNombres.add("Junior");
        listaNombres.add("Leonardo");
        listaNombres.add("Edilson");

        System.out.println(listaNombres);

        for (String nombre: listaNombres) {
            System.out.println(nombre);
        }

        //Los ArrayList nos permiten trabajar con datos de forma dinámica
    }
}
