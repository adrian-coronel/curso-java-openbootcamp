package javaAvanzado.ArquitecturaLimpia.bad.O;

import javaAvanzado.ArquitecturaLimpia.good.S.Vehiculo;

public class MainSOLID {
    public static void main(String[] args) {

        Vehiculo[] vehiculos = {
          new Vehiculo("Coche"), new Vehiculo("Moto"), new Vehiculo("Camion")
        };

        imprimePotencia(vehiculos);

    }

    /**
     * Aqui el problema es que por cada vehiculo nuevo, se tendra que modificar y agregar
     * ELSE IF y nuevo codigo
     * */
    public static void imprimePotencia(Vehiculo vehiculos[]){
        for (Vehiculo vehiculo : vehiculos){
            if (vehiculo.getTipo().equalsIgnoreCase("Coche")){
                System.out.println("1000");
            } else if (vehiculo.getTipo().equalsIgnoreCase("Moto")) {
                System.out.println("500");
            } else if (vehiculo.getTipo().equalsIgnoreCase("Camion")) {
                System.out.println("900");
            }
        }
    }

}
