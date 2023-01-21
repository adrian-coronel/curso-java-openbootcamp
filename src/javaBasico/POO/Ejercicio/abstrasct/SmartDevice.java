package javaBasico.POO.Ejercicio.abstrasct;

public abstract class SmartDevice {

    private Hardware hardware;
    private Middleware middleware;

    public SmartDevice(){}
    public SmartDevice(Hardware hardware, Middleware middleware) {
        this.hardware = hardware;
        this.middleware = middleware;
    }

    public Hardware getHardware() {
        return hardware;
    }
    public void setHardware(Hardware hardware) {
        this.hardware = hardware;
    }
    public Middleware getMiddleware() {
        return middleware;
    }
    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "hardware=" + hardware +
                ", middleware=" + middleware +
                '}';
    }
}
