package javaAvanzado.PatronesDeDiseño.PatronesEstructurales.Facade.conFachada;

import javaAvanzado.PatronesDeDiseño.PatronesEstructurales.Facade.VideoConversionFacade;

public class Main {
    public static void main(String[] args) {
        /**
         * Aca se muestra como la FACHADA oculta la complejidad por detras de esta función
         * */
        VideoConversionFacade conversor = new VideoConversionFacade();
        conversor.convertVideo("fichero.ogg","mp4");
    }
}
