package javaBasico.EjercicioFINAL.dao;

import javaBasico.EjercicioFINAL.entities.Directiva;
import javaBasico.EjercicioFINAL.interfaces.DaoCRUD;
import javaBasico.EjercicioFINAL.json.SchoolJson;

import java.util.HashMap;

public class DirectivoDAO implements DaoCRUD {
    @Override
    public HashMap<String, Directiva> reader() {
        return SchoolJson.getAllDirectivos();
    }

    @Override
    public void create(Object object) {

    }

    @Override
    public void update(Object object) {

    }

    @Override
    public void delete(String key) {

    }
}
