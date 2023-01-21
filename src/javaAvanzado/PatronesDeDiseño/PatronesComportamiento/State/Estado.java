package javaAvanzado.PatronesDeDiseño.PatronesComportamiento.State;

abstract public class Estado {

    public Telefono telefono;

    public Estado(Telefono telefono){
        this.telefono = telefono;
    }

    public abstract String desbloquear();
    public abstract String abrirCamara();
    public abstract String tomarFoto();

}
