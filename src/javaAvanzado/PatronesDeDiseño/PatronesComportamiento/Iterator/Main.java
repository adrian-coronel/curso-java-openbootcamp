package javaAvanzado.PatronesDeDiseño.PatronesComportamiento.Iterator;

public class Main {
    public static void main(String[] args) {

        Usuarios usuarios = new Usuarios();
        usuarios.crear(new Usuario("Adrian",19));
        usuarios.crear(new Usuario("Junior",17));
        usuarios.crear(new Usuario("Leonardo",16));
        usuarios.crear(new Usuario("Edilson",19));
        usuarios.crear(new Usuario("Alonso",14));

        while(usuarios.hasMore()){
            Usuario usuario = usuarios.next();
            System.out.println(usuario);
        }
    }
}
