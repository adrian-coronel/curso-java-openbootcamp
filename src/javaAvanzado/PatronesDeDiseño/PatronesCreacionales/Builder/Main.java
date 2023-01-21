package javaAvanzado.PatronesDeDiseño.PatronesCreacionales.Builder;

public class Main {
    public static void main(String[] args) {

        Vehiculo coche = new CocheBuilder("Toyota")
                .setPuertas(2)
                .setMotor("Mecánico") //Como RETORNAMOS la clase, podemos usar sus METODOS
                .build(); // Retorna el objeto de Tipo VEHICULO
        System.out.println(coche);


        //EJEMPLO DE UN BUILDER EXISTENTE
        StringBuilder cadena = new StringBuilder("HOLA");
        cadena.append(" MUNDO").append(", QUE TAL").append("?");
        System.out.println(cadena);
    }
}
