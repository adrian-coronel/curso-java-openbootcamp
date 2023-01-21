package javaAvanzado.PatronesDeDiseño.PatronesEstructurales.Adapter;

/**Se supone que este aparato, viene de otro lugar y no usa de la misma manera
 * las funcionalidades de nuestra implementacion. Por ello, tendra que ser ADAPTADA*/
public class Lightbulb {
    private boolean poweredOn = false;
    private int voltaje = 0;

    public void turnOn(int voltaje){// Turn ON-> Encendido
        this.voltaje = voltaje;
        poweredOn = true;
    }

    public void turnOff(){
        this.voltaje = 0;
        poweredOn = false;
    }

    public boolean isPoweredOn(){
        return poweredOn;
    }


}
