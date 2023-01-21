package javaBasico.Eventos_XML_JSON.json;

/*Como JSON no tiene una libreria nativa aqui, lo descargamos mediante maven
  entrando a File -> Project Estructure -> libraries -> + -> maven -> y buscamos org.json */
import org.json.*;

import java.io.FileInputStream;
import java.io.InputStream;

public class PasearJSON {
    public static void main(String[] args) {

        try {
            //Creamos el inputStream desde un fichero
            InputStream inputStream = new FileInputStream("datos.json");//Copie un "datos.json" fuera para que funcione

            //Creamos el tokenizador que leera desde nuestro inputStream
            JSONTokener tokener = new JSONTokener(inputStream); //JSONTokener para convertir JSON en Objetos JAVA y biseversa

            //Se lo pasamos a una instancia de JSONObject
            JSONObject jsonObject = new JSONObject(tokener);

            //Sacamos las credenciales
            JSONObject credenciales = jsonObject.getJSONObject("credenciales");

            String usuario = credenciales.getString("usuario");
            String clave = credenciales.getString("clave");

            System.out.println("Usuario: "+usuario+" ; Clave: "+clave);


            // Dentro de credenciales tenemos los videos
            // usamos "credenciales.get..." para obtener el valor, ya que es el PADRE de videos
            JSONArray videos = credenciales.getJSONArray("videos");
            videos.forEach(System.out::println);


        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
