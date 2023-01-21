package javaBasico.Interfaces.sinInterface;

import javaBasico.Interfaces.Empleado;

public class Main {
    public static void main(String[] args) {

        EmpleadoCRUDV1 empleadoCRUDV1 = new EmpleadoCRUDV1();


        Empleado adrian = new Empleado("Adrian","16-08-2003", 9000.0,false);
        Empleado junior = new Empleado("Junior","16-08-2003", 9000.0,false);
        Empleado leonardo = new Empleado("Leonardo","16-08-2003", 9000.0,false);

        //Guardar empleados
        empleadoCRUDV1.guardar(adrian);
        empleadoCRUDV1.guardar(junior);
        empleadoCRUDV1.guardar(leonardo);

        //Ver empleados
        empleadoCRUDV1.findAll().forEach(System.out::println);
        System.out.println(empleadoCRUDV1.findAll());


        //VERSION 2
        EmpleadoCRUDV2 empleadoCRUDV2 = new EmpleadoCRUDV2();
        empleadoCRUDV2.recuperarEmpleados(); //OTRO METODO
    }
}
