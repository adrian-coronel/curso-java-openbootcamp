package javaAvanzado.PatronesDeDiseño.PatronesComportamiento.Strategy;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsuariosFichero implements Usuarios{

    private String ficheroUsuarios = "usuarios.txt";
    private PrintStream fichero;

    public UsuariosFichero(){
        try {
            fichero = new PrintStream(ficheroUsuarios);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void crear(String nombre){
        fichero.println(nombre); //Guardo el nombre en el fichero de texto
    }

    @Override
    public List<String> listar(){
        List<String> usuarios =new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(ficheroUsuarios));
            while (scanner.hasNext()){
                String nombre = scanner.next();
                usuarios.add(nombre);
            }
            scanner.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return usuarios;
    }

}
