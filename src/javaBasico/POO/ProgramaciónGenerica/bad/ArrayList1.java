package javaBasico.POO.ProgramaciónGenerica.bad;

/** SIN UTILIZAR PROGRAMACIÓN GENERICA
 * Suponiendo que no existen los "ArrayList", vamos a realizar un ejercicio
 * para comprender la importancia de la programación genérica. Tratando de
 * que pueda soportar cualquier tipo de Objeto*/

public class ArrayList1 {

    private Object[] datosElemento;
    private int i = 0;

    //Constructor, recibe cantidad de Objetos que almacena
    public ArrayList1(int z){
        datosElemento = new Object[z];
    }

    //Retorna un elemento dependiendo del indice que se ingrese
    public Object get(int i){
        return datosElemento[i];
    }

    //Recibe un tipo de objeto que se almacena en una posición
    public void add(Object objeto){
        datosElemento[i] = objeto;
        i++;
    }

}
