package javaBasico.POO.Ejercicio;

import javaBasico.POO.Ejercicio.abstrasct.Hardware;
import javaBasico.POO.Ejercicio.abstrasct.Middleware;
import javaBasico.POO.Ejercicio.abstrasct.SmartDevice;
import javaBasico.POO.Ejercicio.entities.SmartPhone;
import javaBasico.POO.Ejercicio.entities.SmartWatch;

public class Main {
    public static void main(String[] args) {

        // Hardware y Middleware -> CellPhone
        String actuadorCellPhone = "Actuadores de CellPhone";
        String sensorCellPhone = "Sensores de CellPhone";
        String softwareCellPhone = "Android";

        Hardware hardwareCell = new Hardware(sensorCellPhone, actuadorCellPhone);
        Middleware middlewareCell = new Middleware(softwareCellPhone);


        // Hardware y Middleware -> SmartWatch
        String actuadorCellPhone2 = "Actuadores de SmartWatch";
        String sensorCellPhone2 = "Sensores de SmartWatch";
        String softwareCellPhone2 = "Emui";

        Hardware hardwareWatch = new Hardware(sensorCellPhone2, actuadorCellPhone2);
        Middleware middlewareWatch = new Middleware(softwareCellPhone2);


        // Objeto SmartPhone
        String pantalla = "Full HD";
        String fabricante = "Huawei";
        String bateria = "4000 mA";
        String procesador = "Qualcon";
        double peso = 0.20;
        SmartDevice psmart2019 = new SmartPhone(hardwareCell, middlewareCell,pantalla,fabricante,bateria,procesador,peso);



        // Objeto SmartWatch
        String modelo = "GT3Pro";
        String color = "White";
        String fabricante2 = "Samsung";
        double pulgadas = 5;

        SmartDevice watchGT3Pro = new SmartWatch(hardwareWatch,middlewareWatch,modelo,color,fabricante2,pulgadas);

        //Imprimir objetos
        System.out.println(psmart2019.toString());
        System.out.println(watchGT3Pro.toString());
    }
}













