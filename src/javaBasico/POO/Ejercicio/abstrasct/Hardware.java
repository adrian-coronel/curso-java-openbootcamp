package javaBasico.POO.Ejercicio.abstrasct;

public class Hardware {

    private String sensores;
    private String actuadores;

    public Hardware() {}

    public Hardware(String sensores, String actuadores) {
        this.sensores = sensores;
        this.actuadores = actuadores;
    }
    public String getSensores() {
        return sensores;
    }


    public void setSensores(String sensores) {
        this.sensores = sensores;
    }
    public String getActuadores() {
        return actuadores;
    }
    public void setActuadores(String actuadores) {
        this.actuadores = actuadores;
    }

    @Override
    public String toString() {
        return "Hardware{" +
                "sensores='" + sensores + '\'' +
                ", actuadores='" + actuadores + '\'' +
                '}';
    }
}
