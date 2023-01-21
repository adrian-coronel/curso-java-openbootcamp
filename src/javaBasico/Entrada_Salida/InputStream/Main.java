package javaBasico.Entrada_Salida.InputStream;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {

        //InputStream nos retorna un FLUJO BYTES
        try {
            //FileInputStream es para leer ficheros(retorna secuencia de bytes)
            InputStream fichero = new FileInputStream("MiFile.txt");
            //La secuencia de bytes es un array, por ello mostraremos los valores de MIFILE de la siguiente manera:
            int datos = fichero.read();
            System.out.println((char) datos);



        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
