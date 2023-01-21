package javaBasico.Interfaces.conInterface;

import javaBasico.Interfaces.Empleado;

import java.util.List;

public interface EmpleadoCRUD {


    /**
     * Se DECLARAN los metodos
     *
     * Actua como un contrato, dice lo que hay que hacer, pero no lo hace
     * */
    void save(Empleado empleado);

    List<Empleado> findAll();

    void delete(int index);
}
