package javaBasico.EjercicioFINAL.dao;

import javaBasico.EjercicioFINAL.entities.Alumno;
import javaBasico.EjercicioFINAL.interfaces.DaoCRUD;
import javaBasico.EjercicioFINAL.json.SchoolJson;

import java.util.HashMap;

public class AlumnoDAO implements DaoCRUD {
    @Override
    public HashMap<String, Alumno> reader() {
        return SchoolJson.getAllAlumnos();
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
