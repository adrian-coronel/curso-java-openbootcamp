package javaAvanzado.ArgumentosDeEntrada;

public class Main {
    // Estos son argumentos de entrada -> String[] args
    public static void main(String[] args) {

        //Cuantos parametros recibio
        System.out.println("Parámetros recibidos: " + args.length);
        
        //Que parámetros recibio
        for (String arg : args) {
            System.out.println("El argumento es: " + arg);
        }


        /* Aqui doy un ejemplo de que según los parámetros de entrada nuestro
        *  programa se ajuste a diferentes casos -> Se conoce como "opciones de linea de comando" */
        if (args[0].equalsIgnoreCase("uno")){
            System.out.println("Hola");
        }
        else if (args[0].equalsIgnoreCase("dos")){
            System.out.println("Adios");
        }

    }
}
