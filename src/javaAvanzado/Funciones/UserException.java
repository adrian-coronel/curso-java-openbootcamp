package javaAvanzado.Funciones;

public class UserException extends Exception {
    public UserException(String message){
        super("UserException: " + message);
    }
}
