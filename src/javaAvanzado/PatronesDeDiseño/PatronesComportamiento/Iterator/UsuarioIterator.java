package javaAvanzado.PatronesDeDiseño.PatronesComportamiento.Iterator;

public interface UsuarioIterator {

    //Obtiene el siguiente
    Usuario next();

    //Reinicia el contador que itera
    void reset();

    //Pregunta si hay más usuarios
    boolean hasMore();

}
