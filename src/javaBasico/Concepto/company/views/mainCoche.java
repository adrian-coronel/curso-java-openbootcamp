package javaBasico.Concepto.company.views;

import javaBasico.Concepto.company.entities.CocheElectrico;

public class mainCoche {
    public static void main(String[] args) {
        String coche = "alfa romeo";


        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.setMotorElectrico("Ejemplo motor");
        cocheElectrico.setColor("Rojo");
        cocheElectrico.setVelocidad(70);
        cocheElectrico.setFabricante("Tesla");
        cocheElectrico.setModelo("Apolo900");
        cocheElectrico.setLargo(3.2);
        cocheElectrico.setPeso(1900.0);
        System.out.println(cocheElectrico);

        //Coche Electrico con metodo super
        CocheElectrico cocheElectrico1 = new CocheElectrico("Negro","Ferrari","V1",1450.0,3.2,"Motor Electrico super");
        cocheElectrico1.acelerar(80);
        System.out.println(cocheElectrico1);
    }
}
