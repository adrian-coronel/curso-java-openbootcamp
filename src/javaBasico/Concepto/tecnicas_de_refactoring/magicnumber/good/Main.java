package javaBasico.Concepto.tecnicas_de_refactoring.magicnumber.good;

public class Main {

    /**Final indica que no puede ser modificado desde el codigo*/
    private static final double PRECIO_MINIMO_COMPRA = 100;
    private static final double PRECIO_ENVIO = 4.99;
    private static final double ENVIO_GRATIS = 0;
    private static final double DESCUENTO = 0.1;

    public static void main(String[] args) {

        double price = 129.99;

        double discountPrice = calculateDiscount(price);
        double shippingPrice = calculateShipping(price);

    }

    /**
     *Ya con las variables extraidas en un solo lugar, solo tendríamos que cambiar
     * el valor de las variables y ya no en t0do el codigo que fue puesto
     * */
    private static double calculateShipping(double price){
        return price < PRECIO_MINIMO_COMPRA ? PRECIO_ENVIO : ENVIO_GRATIS; //hard coded
        //si price es menor que 100 retorna 4.99, sino 0
    }
    //Si me solo pongo PRECIO_MINIMO y pongo el puntero encima, ya INTELLIJ me da la opcion para crealo
    private static double calculateDiscount(double price){
        return price * DESCUENTO;
    }

}
