package javaAvanzado.Objetos_DirectivaDeMenorConocimiento.DTO;

import java.util.ArrayList;

public class Usuarios {

    ArrayList<Usuario> usuarios = new ArrayList<>();

    public Usuario obtenerUsuarios(String name){
        for (Usuario usuario : usuarios){
            if (usuario.nombre.equals(name)){
                return usuario;
            }
        }
        return null;
    }

    public void addUser(Usuario usuario){
        usuarios.add(usuario);
    }

}
