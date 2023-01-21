package javaAvanzado.PatronesDeDiseño.PatronesEstructurales.Adapter;

public class Main {
    /**Hemos ADAPTADO la clase "Lightbulb" para que pueda ser usada con la interface*/
    public static void main(String[] args) {
        Horno horno = new Horno();
        Lampara lampara = new Lampara();
        PowerAdapter powerAdapter = new PowerAdapter();

        //Usamos las clases que implementan el contrato mediante el parametro
        encender(horno);
        encender(lampara);
        encender(powerAdapter);

        System.out.println("¿El horno está encendido? -> "+ estaEncendido(horno));
        System.out.println("¿La lampara está encendida? -> "+ estaEncendido(lampara));
        System.out.println("¿El Lightbulb está encendido? -> "+ estaEncendido(powerAdapter));

    }

    //Creación de envoltorio
    public static void encender(Enchufable enchufable){
        enchufable.enciende();
    }
    public static void apagar(Enchufable enchufable){
        enchufable.apaga();
    }
    public static boolean estaEncendido(Enchufable enchufable){
        return enchufable.estaEncendido();
    }
}
