package javaBasico.Eventos_XML_JSON.json;

import jdk.nashorn.internal.runtime.JSONListAdapter;
import org.json.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class MiEjemplo {
    public static void main(String[] args) {

        try {
            //InputStream para leer el archivo
            InputStream inputStream = new FileInputStream("miEjemploJSON.json");

            //JSONTokener para convertir JSON en Objetos JAVA y biseversa
            JSONTokener jsonTokener = new JSONTokener(inputStream);

            //JSONObject para recibir el Objeto del Tokenizador
            JSONObject jsonObject = new JSONObject(jsonTokener);

            //Extraigo el Objeto Familia
            JSONObject familia = jsonObject.getJSONObject("familia");

            //Creo un objeto para guardar "persona1"
            JSONObject persona1 = familia.getJSONObject("persona1");
            JSONObject persona2 = familia.getJSONObject("persona2");
            JSONObject persona3 = familia.getJSONObject("persona3");
            JSONObject persona4 = familia.getJSONObject("persona4");


            System.out.println(persona1);
            System.out.println(persona2);
            System.out.println(persona3);
            System.out.println(persona4);


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }
}
