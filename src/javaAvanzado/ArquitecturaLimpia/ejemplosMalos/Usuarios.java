package javaAvanzado.ArquitecturaLimpia.ejemplosMalos;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * No cumple con el principio de sustitución de Liscot, ya que no extienden o implementan de nada,
 * entonces por lo tanto no pueden sustituirse
 * */
public class Usuarios {

    public String ficheroDatos = "usuario.txt";

    /**
     * Este metodo tambien esta mal, ya que realiza un acceso a datos y comprobaciones,
     * entonces podemos decir que no se realiza una unica responsabilidad
     * */
    public ArrayList<Usuario> listarUsuarios(){
        ArrayList<Usuario> usuarios = new ArrayList<>();

        try {

            Scanner scanner = new Scanner(new File(ficheroDatos));

            while (scanner.hasNext()){
                String usuarioActual = scanner.next();
                String partes[] = usuarioActual.split(",");

                Usuario usuario = new Usuario();
                usuario.setNombreUsuario(partes[0]);
                usuario.setNombre(partes[1]);
                usuario.setApellido(partes[2]);
                usuario.setEmail(partes[3]);
                usuario.setNivelAcceso( Integer.parseInt(partes[4])  );

                usuarios.add(usuario);
            }
            scanner.close();
        } catch (Exception e){

        }
        return usuarios;
    }


    /**
     * Este metodo no cumple con el PRINCIPIO DE RESPONSABILIDAD UNICA ya que no solo obtiene
     * al usuario, sino que tambien está realizando una acceso a datos
     * */
    public Usuario obtenerUsuario(String username){
        try {

            Scanner scanner = new Scanner(new File(ficheroDatos));
            ArrayList<String> usuarios = new ArrayList<>();

            while (scanner.hasNext()){
                usuarios.add(scanner.next());
            }

            scanner.close();

            for (String usuario : usuarios){
                String partes[]  = usuario.split(",");
                String nombreUsuarioActual = partes[0];
                System.out.println(username +" "+ nombreUsuarioActual);

                if (!nombreUsuarioActual.equalsIgnoreCase(username)){
                    continue;
                }
            }

        } catch (Exception e){

        }
        return new Usuario(); //Aca ya lo puse asi nomas, pero no es asi
    }

}
