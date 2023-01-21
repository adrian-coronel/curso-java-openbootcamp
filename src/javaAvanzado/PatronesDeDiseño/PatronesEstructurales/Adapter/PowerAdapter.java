package javaAvanzado.PatronesDeDiseño.PatronesEstructurales.Adapter;

/**La funcion de esta clase consiste en ADAPTAR la clase que viene con funcionalidades diferentes para que pueda cumplir
 * contrato(interface) para que se pueda usar las clases mediante la interface(EN EL MAIN SE OBSERVA)*/
public class PowerAdapter implements Enchufable{

    public Lightbulb lightbulb = new Lightbulb();

    @Override
    public void enciende() {
        lightbulb.turnOn(220);
    }

    @Override
    public void apaga() {
        lightbulb.turnOff();
    }

    @Override
    public boolean estaEncendido() {
        return lightbulb.isPoweredOn();
    }
}
