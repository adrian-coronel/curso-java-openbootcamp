package javaAvanzado.PatronesDeDiseño.PatronesEstructurales.Facade;

public class CodecFactory {

    /**
     * Extrae el TIPO de file que se ingresa
     * */
    public static Codec extract(VideoFile file){
        String type = file.getCodecType();
        if (type.equals("mp4")){
            System.out.println("CodecFactory: extrating mpeg audio...");
            return new MPEG4CompressionCodec();
        } else{
            System.out.println("CodecFactory: extrating ogg audio...");
            return new OggCompressionCodec();
        }
    }

}
