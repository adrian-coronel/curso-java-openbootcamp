package javaAvanzado.PatronesDeDiseño.EjercicioS6_7_y_8;

public class Main {
    public static void main(String[] args) {

        Conexion conn = Conexion.getInstance();
        conn.execute();

        //conn.close();

        System.out.println();

        Conexion conn2 = Conexion.getInstance();
        conn2.execute();


        System.out.println(conn);
        System.out.println(conn2);
    }
}
