package javaAvanzado.PatronesDeDiseño.PatronesCreacionales.Factory;

public class Main {
    public static void main(String[] args) {

        PrecioFactory precioFactory = new PrecioFactory("España");
        System.out.println(     precioFactory.precio.getPrecio()     ); //SIN EMBOLTORIO
        System.out.println(     precioFactory.getPrecio()            ); // CON EMBOLTORIO

        PrecioFactory precioFactory2 = new PrecioFactory("USA");
        System.out.println(     precioFactory2.precio.getPrecio()     ); //SIN EMBOLTORIO
        System.out.println(     precioFactory2.getPrecio()            ); // CON EMBOLTORIO

        PrecioFactory p = new PrecioFactory("Perú");
        System.out.println(p.getPrecio());
    }
}
