package javaAvanzado.PatronesDeDiseño.PatronesEstructurales.Facade;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName,String format){

        System.out.println("VideoConversionFacade: conversion started.");

        VideoFile file = new VideoFile("vamonos_a_marte.mp4");
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec; //Sera el tipo a convertir

        if (format.equals("mp4")){
            destinationCodec = new OggCompressionCodec();
        } else {
            destinationCodec = new MPEG4CompressionCodec();
        }

        VideoFile buffer = BitrateReader.read(file,sourceCodec);//Va leyendo los datos
        VideoFile intermediateResult = BitrateReader.convert(buffer,destinationCodec); //Lo convierte

        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion finally.");
        return result;
    }
}
