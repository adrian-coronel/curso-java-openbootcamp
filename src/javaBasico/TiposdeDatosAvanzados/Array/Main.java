package javaBasico.TiposdeDatosAvanzados.Array;

public class Main {
    public static void main(String[] args) {

        // CUANDO CONOCEMOS LOS VALORES DEL ARRAY
        int numeros[] = { 1, 2, 3, 4, 5};

        String nombres[] = { "Adrian", "Leonardo", "Junior"};

        // CUANDO NO CONOCEMOS LOS VALORES DEL ARRAY
        int numeros2[] = new int[5];
        numeros2[0] = 1;
        numeros2[1] = 2;
        numeros2[2] = 3;
        numeros2[3] = 4;
        numeros2[4] = 5;


        for (int numero : numeros){
            System.out.println(numero);
        }

        //ARRAY BIDIMENSIONAL
        int arrayBidi [][] = new int[2][4]; // Dos filas y Cuatro columna
        //Rellenando la fila 1
        arrayBidi[0][0] = 5;
        arrayBidi[0][1] = 3;
        arrayBidi[0][2] = 78;
        arrayBidi[0][3] = 4;

        //Rellenando fila 2
        arrayBidi[1][0] = 12;
        arrayBidi[1][1] = 34;
        arrayBidi[1][2] = 78;
        arrayBidi[1][3] = 4;

        for (int i = 0 ; i < arrayBidi.length ; i++){ //Itera sobre la primera dimension(FILAS)
            System.out.println("valor de i: "+ i);

            //arrayBidi[i].length -> Longitud de cada fila, que sería las COLUMNAS
            for (int z = 0 ; z < arrayBidi[i].length ; z++){ //Itera sobre la segunda dimension(COLUMNAS)
                System.out.println(arrayBidi[i][z]);
            }
        }


        //OTRA SINTAXIS FORMA BIDIMENSIONAL
        int arrayBidi2[][] = {
                {1, 2, 3 ,4},
                {4, 3, 2 ,1}
        };

        for (int i = 0 ; i < arrayBidi2.length ; i++){ //Itera sobre la primera dimension(FILAS)
            System.out.println("Fila: "+ i);

            //arrayBidi[i].length -> Longitud de cada fila, que sería las COLUMNAS
            for (int z = 0 ; z < arrayBidi2[i].length ; z++){ //Itera sobre la segunda dimension(COLUMNAS)
                System.out.println("Valor en Columna: " +arrayBidi2[i][z]);
            }
        }
    }


}
