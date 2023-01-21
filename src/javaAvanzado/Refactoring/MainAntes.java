package javaAvanzado.Refactoring;

public class MainAntes {
    public static void main(String[] args) {

        int[] numeros = { 2, 4, 7, 56, -5 };
        imprimeMayorYMenor(numeros);

        //Instanciar un constructor largo que es dificil saber que contiene
        ConstructorLargo constructorLargo = new ConstructorLargo("Adrian","Coronel",19,"73260290");

        //La usa otra funcion, no es OPTIMA
        hoyEsDomingo(7);


        System.out.println(esJDKJavaEnWindows());
    }

    private static void imprimeMayorYMenor(int[] numeros) {
        //Primero comenzamos con un if y luego fuimos refactorizando para que se vea más limpio el codigo
        int mayor = 0;
        int menor = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (mayor < numeros[i]){
                mayor = numeros[i];
            }

            if (menor > numeros[i]){
                menor = numeros[i];
            }
        }
        System.out.println("El mayor número es: "+mayor +" y el menor es: "+menor);
    }


    public static int ifAnidado1(){
        int valor1 = 10;
        int valor2 = 10;

        if (valor1 > valor2){
            return valor1;
        } else {
            return valor2;
        }
    }


    public static void hoyEsDomingo(int numero){
        boolean isDomingo = hoyEsDiaNumero(numero);
        if (isDomingo){
            System.out.println("Hoy es domingo");
        }
    }

    public static boolean hoyEsDiaNumero(int numero){
        if (numero == 7){
            return true;
        }
        return false;
    }


    public static boolean esJDKJavaEnWindows(){
        if (System.getProperty("java.runtime.name").contains("Java(TM) SE Runtime Environment") &&
                System.getProperty("os.version").compareTo("10.0") == 0){
            return true;
        }
        return false;
    }
}
