package javaAvanzado.PatronesDeDiseño.PatronesCreacionales.Singleton;

public class Singleton {

    private static Singleton singleton; // Es igual a NULL
    private int contador;

    private Singleton(){} //CON ESTO EVITO QUE SE UTILIZE EL CONSTRUCTOR X DEFECTO, PARA QUE NO SE UTILIZE

    public static Singleton getInstance(){ //Mediante este método, utilizo la instancia a esta clase
        if (singleton == null) {
            singleton = new Singleton(); //Si no esta inicializada, la inicializa
        }
        return singleton; // Si ya lo esta, la retorna
    }


    public int getContador() {
        return contador;
    }
    public void setContador(int contador) {
        this.contador = contador;
    }

}
