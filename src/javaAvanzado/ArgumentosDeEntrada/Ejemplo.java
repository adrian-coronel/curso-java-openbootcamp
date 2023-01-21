package javaAvanzado.ArgumentosDeEntrada;

public class Ejemplo {
    public static void main(String[] args) {

        // --- Opcion Valor


        /*   Es como un array
            +------------+----+------------+-----+
            | --minValue | 10 | --maxValue | 100 | ...
            +------------+----+------------+-----+
posiciones->|      0     |  1 |      2     |  3  | ...
            +------------+----+------------+-----+
         */


        /**Cuando los valores crecen, está opcion deja de ser optima, ya que tendríamos
         * que crear valorias variables y "case"*/
        int opcionMinValue = 0;
        int opcionMaxValue = 0;

        for (int i = 0 ; i < args.length ; i++){
            switch (args[i]){
                case "--minvalue":
                    opcionMinValue = Integer.parseInt(args[i + 1]); // ya que aqui ya estoy obteniendo el "10"
                    i++; //Esto hace que ya no itere encima de "10" sino que se pase defrente a "--maxvalue"
                    break;
                case "--maxvalue":
                    opcionMaxValue = Integer.parseInt(args[i + 1]);
                    i++;
                    break;
            }
        }
        System.out.println("minValue: " +opcionMinValue+ " maxValue: " +opcionMaxValue);
    }
}
