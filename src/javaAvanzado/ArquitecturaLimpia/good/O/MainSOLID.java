package javaAvanzado.ArquitecturaLimpia.good.O;

public class MainSOLID {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
                new Coche(), new Moto(), new Camion()
        };

        imprimePotencia(vehiculos);

        /* De igual forma, estamos cumplicando con el principio de LISKOV, ya que si cambiamos
        *  una clase por otra, seguirá funcionando. Por ejemplo: */
        Coche coche = new Coche(); // Si cambio coche por moto seguirá funcionando -> Moto coche = new Moto()
        System.out.println(coche.obtenerPotencia());//Sigue funcionando

    }

    /**
     * Aqui cumplo con el principio Open Close, ya que las clases extienden de Vehiculo
     * puedo usar ellas de manera más optima y si quiero agregar un nuevo vehiculo como
     * Camioneta, puedo hacerlo SIN MODIFICAR EL CODIGO YA ESTRUCTURADO
     * */
    public static void imprimePotencia(Vehiculo vehiculos[]){
        for (Vehiculo vehiculo : vehiculos){
            System.out.println(vehiculo.obtenerPotencia());
        }
    }

}
