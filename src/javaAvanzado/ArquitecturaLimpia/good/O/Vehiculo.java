package javaAvanzado.ArquitecturaLimpia.good.O;

public abstract class Vehiculo {

    private String tipo;

    public Vehiculo(){}
    public Vehiculo(String tipo){
        this.tipo = tipo;
    }

    abstract int obtenerPotencia();

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

