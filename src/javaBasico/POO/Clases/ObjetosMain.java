package javaBasico.POO.Clases;

public class ObjetosMain {
    public static void main(String[] args) {

        //Clase identificador = new Clase();

        //Objeto utilizando el constructor con parametros:
        Vehiculo ferrariG19 = new Vehiculo("FERRARI","G19","2022");


        //Objeto utilizando constructor vacio:
        Vehiculo toyotaCorolla = new Vehiculo();
        toyotaCorolla.setFabricante("TOYOTA");
        toyotaCorolla.setModelo("COROLLA");
        toyotaCorolla.setAño("2018");

        System.out.println(ferrariG19.toString());
        System.out.println(toyotaCorolla.toString());
    }
}
