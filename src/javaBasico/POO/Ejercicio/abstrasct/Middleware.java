package javaBasico.POO.Ejercicio.abstrasct;

public class Middleware {

    private String software;

    public Middleware(){}
    public Middleware(String software) {
        this.software = software;
    }

    public String getSoftware() {
        return software;
    }
    public void setSoftware(String software) {
        this.software = software;
    }

    @Override
    public String toString() {
        return "Middleware{" +
                "software='" + software + '\'' +
                '}';
    }
}
