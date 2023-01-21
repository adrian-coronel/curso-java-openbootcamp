package javaBasico.Concepto.tecnicas_de_refactoring.extractvariable.good;

public class Main {

    /* Sombreando el metodo "oder.getPrice", click derecho, click en refactor.
    *  click en "introduce variable"*/

    //ESTA FORMA ES MUCHO MÁS FACIL DE LEER Y MENOS PROPENSA A QUE OCURRAN FALLOS
    public void printProductPrice(Order order) {
        //1. Precio total de los productos
        Double quantityPrice = order.getPrice() * order.getQuantity();

        //2. Descuento
        Double offerPrice = order.getPrice() * order.getOffer();

        //3. Precio final = precio total menos el descuento
        Double finalPrice = quantityPrice - offerPrice;

        //4. Calculo del precio del envio
        Double shippingPrice = order.getShipping() * 2;

        //TODO - 3.1 nuevo calculo
        System.out.println(finalPrice + shippingPrice);
    }

}
