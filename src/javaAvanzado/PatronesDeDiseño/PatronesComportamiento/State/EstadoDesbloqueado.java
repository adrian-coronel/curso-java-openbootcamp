package javaAvanzado.PatronesDeDiseño.PatronesComportamiento.State;

public class EstadoDesbloqueado extends Estado{

    public EstadoDesbloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "(desbloquear) El dispotivo ya se encuentra desbloqueado";
    }

    @Override
    public String abrirCamara() {
        //Para usar este metodo, debo de usar antes el metodo "desbloquear" de la clase "EstadoBloqueado"
        telefono.cambiarEstado(new EstadoCamaraAbierta(telefono));
        return "(abrirCamara) Camara abierta";
    }

    @Override
    public String tomarFoto() {
        return "tomarFoto(): Debe abrir la camará antes";
    }

}
