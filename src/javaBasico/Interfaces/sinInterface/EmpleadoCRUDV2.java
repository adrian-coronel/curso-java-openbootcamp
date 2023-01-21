package javaBasico.Interfaces.sinInterface;

import javaBasico.Interfaces.Empleado;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUDV2 {

    /**
     * Aqui el error o dificultad que se estaría formando, es que
     * existe la posibilidad de que otro programador cree los mismos
     * metodos, PERO con diferentes NOMBRES, lo que no estaria bien.
     *
     * Otra cosa tambien sería que si hace una actualización y se cambia
     * codigo, como el nombre de metodos, se tendría que cambiar en y poner los
     * nuevos nombres en donde los llamamos(sería más optimo que estos
     * ya estén definidos como una plantilla)*/

    //Conecta la BD
    public List<Empleado> recuperarEmpleados(){
        List<Empleado> empleados = new ArrayList<>();
        return empleados;
    }


}
