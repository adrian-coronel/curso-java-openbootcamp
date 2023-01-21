package javaAvanzado.PrincipioSOLID.S.bad;

public class Usuario {

    public void crearUsuario(String username){}
    public void obtenerUsuario(String username){}

    // Aqui también rompemos con el principio de responsabilidad unica
    public void enviarEmail(String username){}
}
