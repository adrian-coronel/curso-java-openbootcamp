package javaAvanzado.Objetos_DirectivaDeMenorConocimiento.DTO;

import java.util.ArrayList;

public class Usuario {
    String nombre;
    ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    private Usuario(){}

    public Usuario(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void addVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
}
