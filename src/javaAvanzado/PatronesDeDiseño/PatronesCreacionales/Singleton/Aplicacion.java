package javaAvanzado.PatronesDeDiseño.PatronesCreacionales.Singleton;

/** EJEMPLO DE COMO SE IMPLEMENTA EL PATRON SINGLETON **/

public class Aplicacion {

    private static Aplicacion aplicacion;
    private  boolean isRunning = false;

    private Aplicacion(){}

    public static Aplicacion getInstance(){
        if (aplicacion == null){
            aplicacion = new Aplicacion();
        }
        return aplicacion;
    }

    /** Como aca yo no quiero que se creen 2 objetos "Aplicacion"
     *  porque se supone que con crearla 1 vez ya la tendriamos en ejecucion*/
    public void Run(){
        if (!isRunning){
            isRunning = true;
        } else {
            System.out.println("Ya estaba en ejecución");
        }
    }

}
