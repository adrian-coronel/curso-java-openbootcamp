package javaAvanzado.PatronesDeDiseño.PatronesEstructurales.Decorator;

public class TelefonoBasico implements Telefono{

    @Override
    public void crear() {
        System.out.println("Soy un telefono basico creado, con las siguientes características:");
        tengoSMS();
        tengoGMS();
    }

    private void tengoSMS(){
        System.out.println("TelefonoBasico -> Cuento con SMS");
    }

    private void tengoGMS(){
        System.out.println("TelefonoBasico -> Cuento con GMS");
    }
}
