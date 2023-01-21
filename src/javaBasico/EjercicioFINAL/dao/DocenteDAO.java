package javaBasico.EjercicioFINAL.dao;

import javaBasico.EjercicioFINAL.entities.Docente;
import javaBasico.EjercicioFINAL.interfaces.DaoCRUD;
import javaBasico.EjercicioFINAL.json.SchoolJson;

import java.util.HashMap;

public class DocenteDAO implements DaoCRUD {
    @Override
    public HashMap<String, Docente> reader() {
        return SchoolJson.getAllDocentes();
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
