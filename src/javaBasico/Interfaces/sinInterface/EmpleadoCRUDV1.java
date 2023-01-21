package javaBasico.Interfaces.sinInterface;

import javaBasico.Interfaces.Empleado;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUDV1 {

    //Simulación de BD
    private List<Empleado> empleados = new ArrayList<>();

    //Guardar un empleado
    public void guardar(Empleado empleado){
        empleados.add(empleado);
    }

    public List<Empleado> findAll(){
        return empleados;
    }
}
