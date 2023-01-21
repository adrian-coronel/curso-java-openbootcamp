package javaAvanzado.PatronesDeDiseño.PatronesComportamiento.Strategy;

import java.util.ArrayList;
import java.util.List;

public class UsuariosMemoria implements Usuarios{

    private List<String> usuarios = new ArrayList<>();

    @Override
    public void crear(String nombre){
        usuarios.add(nombre);
    }

    @Override
    public List<String> listar(){
        return usuarios;
    }

}
