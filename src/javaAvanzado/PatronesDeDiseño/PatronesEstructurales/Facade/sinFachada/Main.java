package javaAvanzado.PatronesDeDiseño.PatronesEstructurales.Facade.sinFachada;

import javaAvanzado.PatronesDeDiseño.PatronesEstructurales.Facade.*;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        System.out.println("Comienzo la conversion del video...");

        VideoFile file = new VideoFile("vamonos_a_marte.mp4");
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec; //Sera el tipo a convertir
        String format = "mp4";

        if (format.equals("mp4")){
            destinationCodec = new OggCompressionCodec();
        } else {
            destinationCodec = new MPEG4CompressionCodec();
        }

        VideoFile buffer = BitrateReader.read(file,sourceCodec); //Va leyendo los datos
        VideoFile intermediateResult = BitrateReader.convert(buffer,destinationCodec);

        File result = new AudioMixer().fix(intermediateResult);
        System.out.println("Terminado");
    }
}
