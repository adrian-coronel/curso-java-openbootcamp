package javaAvanzado.PatronesDeDiseño.PatronesComportamiento.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Usuarios implements UsuarioIterator{

    /**Da igual el tipo de contenedor que se use, pues el PATRON ITERATOR se encargá de
     * que se cumpla el funcionamiento de los metodos implementados*/
    private List<Usuario> usuarioList = new ArrayList<>();
    private int posicion = 0;

    public void crear(Usuario usuario){
        usuarioList.add(usuario);
    }

    @Override
    public Usuario next() {
        Usuario usuario = this.usuarioList.get(posicion);
        posicion += 1;
        return usuario;
    }

    @Override
    public void reset() {
        posicion = 0;
    }

    @Override
    public boolean hasMore() {
        return posicion < usuarioList.size();
    }
}
