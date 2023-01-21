package javaBasico.Concepto.tecnicas_de_refactoring.extractvariable.bad;

public class Main {

    public void printProductPrice(Order order){
        Double totalPrice = order.getPrice() * order.getQuantity()
                - order.getOffer() + order.getShipping() * 2;
        System.out.println(totalPrice);
    }

}
