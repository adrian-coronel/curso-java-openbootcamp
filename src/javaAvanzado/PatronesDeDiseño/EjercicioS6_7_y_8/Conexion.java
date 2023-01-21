package javaAvanzado.PatronesDeDiseño.EjercicioS6_7_y_8;

public class Conexion {

    private static Conexion conexion;
    private boolean execute = false;


    public static Conexion getInstance(){
        if(conexion == null){
           conexion = new Conexion();
        }
        return conexion;
    }

    public boolean execute(){
        if (execute){
            System.out.println("La conexión ya estaba en ejecución");
        }else {
            System.out.println("La conexión inicio correctamente");
        }
        return execute = true;
    }
    public void close(){
        execute = false;
        System.out.println("Conexión cerrada");
    }

}
