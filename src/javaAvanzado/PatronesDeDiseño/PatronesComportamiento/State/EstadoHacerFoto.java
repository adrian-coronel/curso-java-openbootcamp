package javaAvanzado.PatronesDeDiseño.PatronesComportamiento.State;

public class EstadoHacerFoto extends Estado{

    public EstadoHacerFoto(Telefono telefono) {
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
        telefono.cambiarEstado(new EstadoCamaraAbierta(telefono));
        return "tomarFoto(): Foto realizada";
    }
}
