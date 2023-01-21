package javaAvanzado.ArquitecturaLimpia.bad.D;

public class SOLIDD {

    DataBase dataBase;

    public void obtenerData(DataBase datos){
        dataBase.obtenerDatos(datos);
    }
    public void enviarData(DataBase datos){
        dataBase.enviarDatos(datos);
    }

}
