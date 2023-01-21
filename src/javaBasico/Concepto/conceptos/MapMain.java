package javaBasico.Concepto.conceptos;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {

        Map<String,String> personas = new HashMap<>();
        personas.put("73260290","Adrian Coronel");
        personas.put("73234234","Junior Coronel");
        personas.put("73345424","Leonardo Coronel");

        System.out.println(personas);

        for(String key : personas.keySet()){ //KeySet me retorna el conjunto de claves
            System.out.println(key);
        }

        for(String value : personas.values()){ //values me retorna el conjunto de valores
            System.out.println(value);
        }

        for (Map.Entry<String,String> entry : personas.entrySet()){ //entrySet retorna un par de clave y valor
            System.out.println(entry.getKey() + "="+ entry.getValue());
        }
    }
}
