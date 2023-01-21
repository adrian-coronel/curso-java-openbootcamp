package javaAvanzado.PatronesDeDiseño.PatronesCreacionales.Prototype;

// En esta 2da forma, implementamos la interface -> "Cloneable"
public class Coche_Forma2 implements Cloneable {

    private String marca;
    private String modelo;
    private int puertas;

    public Coche_Forma2(){}

    public Coche_Forma2 clonar() throws CloneNotSupportedException{
        /*Aqui uso un Cats, ya que el metodo "clone" de la interfaz "Cloneable"
         *retorna un "Object" entonces con el CATS los fuerzo a que retorne un "COCHE_FORMA2"*/
        return (Coche_Forma2) this.clone();
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
        return "Coche_Forma2{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", puertas=" + puertas +
                '}';
    }
}
