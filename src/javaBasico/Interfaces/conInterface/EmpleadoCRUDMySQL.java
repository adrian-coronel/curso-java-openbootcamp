package javaBasico.Interfaces.conInterface;

import javaBasico.Interfaces.Empleado;
import java.util.List;

/**
 * Cuando implementas una interfaz estas obligado a cumplir el contrato
 * y darle cuerpo a los métodos declarados
 *
 * Una ventaja es que podemos implementar varias interfaces
 * */
public class EmpleadoCRUDMySQL implements EmpleadoCRUD{



    @Override
    public void save(Empleado empleado) {

    }

    @Override
    public List<Empleado> findAll() {
        return null;
    }

    @Override
    public void delete(int index) {

    }
}
