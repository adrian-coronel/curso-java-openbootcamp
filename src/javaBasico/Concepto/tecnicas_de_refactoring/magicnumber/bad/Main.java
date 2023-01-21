package javaBasico.Concepto.tecnicas_de_refactoring.magicnumber.bad;

public class Main {
    public static void main(String[] args) {

        double price = 129.99;

        double discountPrice = calculateDiscount(price);
        double shippingPrice = calculateShipping(price);

    }

    /**
     * Aqui lo que se conoce como número magico es el 4.99, ya que si
     * nos ponemos en un contexto en el que se tenga mucho codigo y
     * resulta que este numero 4.99 llega a cambiar un día, tendriamos que
     * ir a todas las funciones que tengan este numero y cambiarlo uno por uno.
     * Por ello sería tenerlo como una variable en un solo sitio y no en toda la app
     * */
    private static double calculateShipping(double price){
        return price < 100 ? 4.99 : 0; //hard coded
        //si price es menor que 100 retorna 4.99, sino 0
    }

    private static double calculateDiscount(double price){
        return price * 0.1;
    }

}
