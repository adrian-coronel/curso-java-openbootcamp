package javaAvanzado.PatronesDeDiseño.PatronesCreacionales.Factory;

import java.util.HashMap;

public class PrecioFactory {

    Precio precio; // Variable de la Interface "Precio", permite la jerarquia de clases, en una sola
    private PrecioFactory(){}

    //Usamos el constructor con parametros
    public PrecioFactory(String pais){
        if (pais.equalsIgnoreCase("España")){
            System.out.println("España, precio en EUR");
            this.precio = new PrecioEUR();
        } else if (pais.equalsIgnoreCase("Perú")){
            System.out.println("Perú, precio en SOLES");
            this.precio = new PrecioSOL();
        }
        else {
            System.out.println("Otro pais, precio en USD");
            this.precio = new PrecioUSD();
        }
    }

    //Esto se conoce como emboltorio, para que la llamada no sea larga en el MAIN
    public double getPrecio(){
        return precio.getPrecio(); //Esto me sirve para que no se vea MUY LARGO EN EL MAIN
    }

}
