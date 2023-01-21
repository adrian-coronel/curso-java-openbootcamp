package javaAvanzado.PatronesDeDiseño.PatronesCreacionales.Prototype;

public class Coche {

    private String marca;
    private String modelo;
    private int puertas;

    public Coche(){}

    public Coche clonar(){
        Coche clon = new Coche();
        clon.marca = this.marca;
        clon.modelo = this.modelo;
        clon.puertas = this.puertas;
        return clon;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", puertas=" + puertas +
                '}';
    }
}
