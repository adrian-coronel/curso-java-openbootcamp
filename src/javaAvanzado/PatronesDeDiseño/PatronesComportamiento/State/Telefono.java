package javaAvanzado.PatronesDeDiseño.PatronesComportamiento.State;

public class Telefono {

    public Estado estado;

    public Telefono(){
        //Aqui tengo que decirle que se encuentra en estado BLOQUEADO
        estado = new EstadoBloqueado(this); //El telefono por defecto se encontra bloqueado
    }

    public void cambiarEstado(Estado estado){
        System.out.println("Estado inicial" + this.estado.getClass().getName());
        this.estado = estado;
        System.out.println("Estado final" + this.estado.getClass().getName());
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
