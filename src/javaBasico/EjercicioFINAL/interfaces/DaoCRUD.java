package javaBasico.EjercicioFINAL.interfaces;

import java.util.HashMap;

public interface DaoCRUD {

    HashMap reader();

    void create(Object object);

    void update(Object object);

    void delete(String key);

}
