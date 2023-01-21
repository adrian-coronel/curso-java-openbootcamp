package javaAvanzado.Funciones;

import java.util.ArrayList;

public class Usuarios {

    private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    public void addUsers(Usuario ...usuarios) throws UserException { //Devolvera exepciones derivadas de UserExcetion
        for (Usuario usuario : usuarios){
            if (this.usuarios.contains(usuario)){
                throw new UserRegisteredException(usuario.getNombre()); //UserRegisteredException -> Derivada de "UserExcetion"
            }
            this.usuarios.add(usuario);
        }
    }

}
