package javaBasico.Entrada_Salida.BufferInputStream;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        /**
         * El BufferedInputStream, va guardando en memoria en trozos grandes y lo
         * va dando en trozos pequeños (No cargaría t0do en memoria y no nosotros
         * accederemos a t0do a la vez)
         * */
        try {
            InputStream fichero = new FileInputStream("MiFile.txt");
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);//Leerá trozos grandes y dará trozos pequeños

            int dato = ficheroBuffer.read();
            while (dato != -1){
                System.out.print((char)dato);
                dato = ficheroBuffer.read();
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
