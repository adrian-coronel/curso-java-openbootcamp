package javaBasico.TiposdeDatosAvanzados.Mapas;

import java.util.HashMap;
import java.util.Map;

public class Main {
    /** Mapas conocidos como Array Asociativo
     *
     * Una mapa es una especie de diccionario, donde se tiene una
     * clave(llave) y un valor
     * */
    public static void main(String[] args) {
        //El más conocido es HashMap
        HashMap<String, Integer> map = new HashMap<>();

        map.put("uno", 10); //"put" busca si existe la clave para actualizar, sino la crea
        map.put("dos", 10);
        //Si yo ingreso un valor con una clave ya existente, el valor se sobreescribe
        map.put("tres", 10);
        map.put("tres", 49);
        map.replace("mil",1000); //"replace" busca si existe la clave para reemplazar, sino existe NO la crea

        System.out.println(map);
        System.out.println(map.get("tres"));

        // Formas de reemplazar un valor
        map.put("dos", 20); // Machacandolo
        map.replace("dos",40); //Mediante su método

        // Eliminar
        map.remove("dos"); //Elimina mediante la clave


        // Iterar sobre un Mapa
        for (Map.Entry<String,Integer> element : map.entrySet()){
            System.out.println("Clave: "+element.getKey() + ", Value: "+element.getValue());
        }


    }
}
