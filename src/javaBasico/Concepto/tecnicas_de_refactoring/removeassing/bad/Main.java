package javaBasico.Concepto.tecnicas_de_refactoring.removeassing.bad;

import javaBasico.Concepto.tecnicas_de_refactoring.removeassing.Order;

public class Main {

    double calculateDicount(Order order, double totalPrice){
        if(order == null || order.getPrice() == null){ //programacion defensiva
            return totalPrice;
        }
        if(order.getPrice() > 100){
            totalPrice += order.getPrice() * order.getOffer();  //Sobreescribe totalPrice
        }
        return totalPrice;
    }
    /**Lo que pasa es que esta modificando un parametro, y sería un modificacion
     * impura, ya que puede tener efectos secundarios
     *
     * Los parametros no se modifican, si quieres el valor, crea una variable*/
}
