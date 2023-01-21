package javaAvanzado.ArquitecturaLimpia.bad.S;

public class Vehiculo {

    private String tipo;

    public Vehiculo(){}
    public Vehiculo(String tipo){
        this.tipo = tipo;
    }

    /* ESTO ESTA MAL YA QUE MI CLASE NO SOLO GESTIONA VEHICULO, SINO QUE
    *  TAMBÍEN REALIZA OTRAS RESPONSABILIDADES COMO ACCESS DATABASE*/
    public void guardaVehiculo(Vehiculo vehiculo){
        // Coneccion a la BD
        // Comprobación de que no exista
        // Inserto el registro
        // Finalizo
    }
    //LO CORRECTO ES QUE LO PONGA EN OTRA CLASE

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

