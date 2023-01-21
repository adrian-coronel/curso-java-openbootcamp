package javaBasico.Interfaces.conInterface;

import javaBasico.Interfaces.Empleado;

public class Main {

    /**
     * Si aca yo cambio "EmpleadoCRUDMySQL" por "EmpleadoCRUDOracle" no tendría
     * ningun problema en el MAIN, ya que ambas implementaciones cumplen con un
     * contrato.
     * */
    static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD_Oracle();

    public static void main(String[] args) {

        empleadoCRUD.findAll();
        empleadoCRUD.save(new Empleado());
        empleadoCRUD.delete(2);

    }
}
