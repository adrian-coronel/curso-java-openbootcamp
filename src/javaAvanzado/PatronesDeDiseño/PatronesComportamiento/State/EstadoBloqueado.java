package javaAvanzado.PatronesDeDiseño.PatronesComportamiento.State;

public class EstadoBloqueado extends Estado{


    public EstadoBloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        telefono.cambiarEstado(new EstadoDesbloqueado(telefono));
        return "(desbloquar) Movil desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "(abrirCamara)La cama está bloqueada, desbloquea para usarla";
    }

    @Override
    public String tomarFoto() {
        return "(tomarFoto)La cama está bloqueada, desbloquea para usarla";
    }
}
