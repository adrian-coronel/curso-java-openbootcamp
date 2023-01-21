package javaAvanzado.Nombrado;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,-5};
        System.out.println(CocheElectrico.getMenor(numeros));;
    }
}

//Las CLASES comienzan con mayuscula
class CocheElectrico{
    public static final int MAX_USERS = 15; //Constante
    public void createUser(){} //Nuestro método es claro y conciso

    //Mi variable describe que es un array de numeros
    int[] numeros = {1,2,3,4,5};
    //La unica forma de usar variables sin sentido es dentro de los bucles -> "i"
    public static int getMenor(int[] numeros){
        int menor = 0;
        for (int i = 0 ; i < numeros.length ; i++){
            menor = menor < numeros[i] ? menor : numeros[i];
        }
        return menor;
    }
}
class NotacionUngara{
    CocheElectrico oCocheElectrico; //Letra "o" para objetos
    int[] aNumeros = {1,2,3,4,5};
    boolean bEsPar;
    char cLetra;
    double dValor;
    Hashtable<String,Integer> hUsuarios;
    int iValores; // -> El "i" hace referencia a tipos enteros como LONG
    String sCadena;
    byte byByte;
    float flFloate;

    String[] asNombres;
    int[] aiNumeros2;
    double[] adDecimales;

}
//LAS ENUMERACION COMIENZAN CON "n"
enum nEstado{
    INICIAL,EN_PROGRESO;
}

//Debemos tratar que la interface sea un adjetivo y termine con "able" si son escritas en ingles
interface Iterable{
}
interface Serializable{
}
interface Iterador { //En Español
}
interface Serializador{ //En Español
}

