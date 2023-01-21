package javaAvanzado.ArquitecturaLimpia.good.S;

public class Vehiculo {

    private String tipo;

    public Vehiculo(){}
    public Vehiculo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

