package javaAvanzado.PatronesDeDiseño.PatronesComportamiento.Strategy;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        int tipo = 0;

        Usuarios usuario;

        if (tipo == 0){
            usuario = new UsuariosMemoria();
        } else {
            usuario = new UsuariosFichero();
        }


        /*El patron Strategy, dice que si tenemos clases que implementan de la misma interfaz,
        * si creamos encima de estos un EMBOLTORIO podemos utilizarlas indistintamente*/
        crear(usuario,"Adrian");
        crear(usuario,"Junior");
        crear(usuario,"Leonardo");
        System.out.println(usuario);
        listar(usuario).forEach(System.out::println);


    }

    //Creo mi emboltorio que invocará a una clase, dependiendo del parametró que le ingrese
    public static void crear(Usuarios usuarios, String nombre){
        usuarios.crear(nombre);
    }

    public static List<String> listar(Usuarios usuarios){
        return usuarios.listar();
    }
}
