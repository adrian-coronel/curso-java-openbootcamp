package javaAvanzado.ProgramacionFuncional.FuncionesPuras;

public class Main {

    private static int contador = 0;

    public static void main(String[] args) {
        System.out.println(suma(1,2));
        System.out.println(suma(1,2));
    }

    /**
     * Esta es una función pura básica, ya que cumple un requisito:
     * - Siempre devuelve el mismo valor, cuando sus parámetros de entrada no varien
     * - Otro requisito, es que no debe tener efecto colaterales, es decir, no debe
     *   modificar valores que no pertenezcan a la función.
     * - Tiene que hacer exactamente lo que dice(SI DICE SUMAR, SOLO DEBE SUMAR).
     * */
    public static int suma(int a, int b){
        //contador+=1; -> Esto es un efecto colateral(haría que mi función sea impura)
        return a + b;
    }




}
