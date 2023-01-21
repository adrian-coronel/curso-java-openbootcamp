package javaBasico.EjercicioFINAL.json;

import javaBasico.EjercicioFINAL.entities.Alumno;
import javaBasico.EjercicioFINAL.entities.Directiva;
import javaBasico.EjercicioFINAL.entities.Docente;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class SchoolJson {

    private static HashMap<String, Alumno> alumnos = new HashMap<>();
    private static HashMap<String, Docente> docentes = new HashMap<>();
    private static HashMap<String, Directiva> directivos = new HashMap<>();

    public static HashMap<String, Alumno> getAllAlumnos(){
        try{
            InputStream file = new FileInputStream("SistemaEducativo.json");
            JSONTokener tokener = new JSONTokener(file);
            JSONObject jsonObject = new JSONObject(tokener);
            JSONObject colegio = jsonObject.getJSONObject("colegio1");
            JSONObject alumnado = colegio.getJSONObject("alumnado");

            for (String key : alumnado.keySet()){
                JSONObject alumno = alumnado.getJSONObject(key);
                String codigo = alumno.getString("codigo");
                String apellido = alumno.getString("apellido");
                String nombre = alumno.getString("nombre");
                Integer edad = alumno.getInt("edad");
                double notasTeo = getAverageArray(alumno.getJSONArray("notasTeo"));
                double notasLab = getAverageArray(alumno.getJSONArray("notasLab"));

                alumnos.put(codigo,new Alumno(codigo,nombre,apellido,edad,notasTeo,notasLab));

            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        return alumnos;
    }

    public static HashMap<String, Docente> getAllDocentes(){
        try{
            InputStream file = new FileInputStream("SistemaEducativo.json");
            JSONTokener tokener = new JSONTokener(file);
            JSONObject jsonObject = new JSONObject(tokener);
            JSONObject colegio = jsonObject.getJSONObject("colegio1");
            JSONObject jsonDocentes = colegio.getJSONObject("docentes");

            for (String key : jsonDocentes.keySet()){
                JSONObject docente = jsonDocentes.getJSONObject(key);
                String codigo = docente.getString("codigo");
                String apellido = docente.getString("apellido");
                String nombre = docente.getString("nombre");
                String area = docente.getString("area");
                Integer edad = docente.getInt("edad");


                docentes.put(codigo,new Docente(codigo,nombre,apellido,edad,area));

            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        return docentes;
    }

    public static HashMap<String, Directiva> getAllDirectivos(){
        try{
            InputStream file = new FileInputStream("SistemaEducativo.json");
            JSONTokener tokener = new JSONTokener(file);
            JSONObject jsonObject = new JSONObject(tokener);
            JSONObject colegio = jsonObject.getJSONObject("colegio1");
            JSONObject jsonDirectivos = colegio.getJSONObject("directivos");

            for (String key : jsonDirectivos.keySet()){
                JSONObject directivo = jsonDirectivos.getJSONObject(key);
                String codigo = directivo.getString("codigo");
                String apellido = directivo.getString("apellido");
                String nombre = directivo.getString("nombre");
                String cargo = directivo.getString("cargo");
                Integer edad = directivo.getInt("edad");

                directivos.put(codigo,new Directiva(codigo,nombre,apellido,edad,cargo));

            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        return directivos;
    }

    private static double getAverageArray(JSONArray array){
        double promedioTeo = 0;
        for (int i = 0 ; i < array.length() ; i++){
            double num = Double.parseDouble(String.valueOf(array.get(i)));
            promedioTeo += num;
        }
        return Math.round(promedioTeo / array.length()*100.0)/100.0;
    }

}
