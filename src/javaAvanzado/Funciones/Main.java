package javaAvanzado.Funciones;

public class Main {
    public static void main(String[] args) {

        //No es necesario que sea funcion
        boolean mayor = esMayor(4,5);

        boolean mayorGood = 4 > 5 ? true : false;

        a();
    }

    //Cuando la funcion es InLine (de una linea o pequeñas) NO es necesaria que sea funcion
    private static boolean esMayor(int a, int b) {
        return a > b ? true : false;
    }

    /** Cuando una funcion es muy grande, se refactoriza y se divide en funciones concretas y más cortas
     * Una funcion resuelve una sola tarea
     * */

    /* La regla descendente: Consiste en que la funcion que llame a otra funcion debe tener una dificultad descendente,
     * es decir, la funcion que se llame en el main debe ser facil de entender, la funcion que este por detras sea
     * medianamente compleja y la que este por detras de esta, sea dificil.
     * EJEMPLO:
     */
    /**ESTO NO SE DEBE HACER*/
    public static void a(){
        b();
    }
    public static void b(){
        c();
    }
    public static void c(){
        d();
    }
    public static void d(){
        e();
    }
    public static void e(){
        System.out.println("Estoy en e()");
    }

}
