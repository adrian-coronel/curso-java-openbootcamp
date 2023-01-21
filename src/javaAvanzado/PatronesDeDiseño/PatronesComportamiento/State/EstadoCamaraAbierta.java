package javaAvanzado.PatronesDeDiseño.PatronesComportamiento.State;

public class EstadoCamaraAbierta extends Estado{

    public EstadoCamaraAbierta(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "(desbloquear) El dispotivo ya se encuentra desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara(): La camara ya esta abierta";
    }

    @Override
    public String tomarFoto() {
        telefono.cambiarEstado(new EstadoHacerFoto(telefono));
        return "cargando foto";
    }
}
