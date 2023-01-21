package javaBasico.Concepto.conceptos;

public class ArraysMain {
    public static void main(String[] args) {

        String nombre1 = "Adrian";
        String nombre2 = "Junior";
        String nombre3 = "Leonardo";
        String nombre4 = "Edilson";

        String[] nombres = new String[4];
        String[] nombres2 = new String[]{nombre1,nombre2,nombre3,nombre4};
        nombres[0] = nombre1;
        nombres[1] = nombre2;
        nombres[2] = nombre3;
        nombres[3] = nombre4;

        for (int i = 0 ; i<nombres.length ; i++){
            System.out.println(nombres[i]);
            System.out.println(nombres2[i]);
        }

        //Los arrays son estaticos ya que no podemos agregar más valores de lo indicado
    }
}
