package javaAvanzado.Objetos_DirectivaDeMenorConocimiento.DTO;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Adrian");
        usuario.addVehiculo(new Vehiculo("Auto"));

        Usuario usuario1 = new Usuario("Junior");
        usuario1.addVehiculo(new Vehiculo("Auto"));
        usuario1.addVehiculo(new Vehiculo("Moto"));

        Usuarios usuarios = new Usuarios();
        usuarios.addUser(usuario);
        usuarios.addUser(usuario1);

        Usuario userInfo = usuarios.obtenerUsuarios("Adrian");
        System.out.println(userInfo.nombre);

        for (Vehiculo vehiculo : userInfo.vehiculos){
            System.out.println(vehiculo.tipo);
        }

        /*
         * Obtengo los datos del usuario, como lo es su Vehiculo
         */
    }
}
