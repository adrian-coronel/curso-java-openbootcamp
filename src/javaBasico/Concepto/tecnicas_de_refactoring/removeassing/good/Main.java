package javaBasico.Concepto.tecnicas_de_refactoring.removeassing.good;

import javaBasico.Concepto.tecnicas_de_refactoring.removeassing.Order;

public class Main {

    /**
     * Estariamos manteniendo el valor del parametro intacto, ya que si la modificamos
     * cuando la queramos usar, ya tendría otro valor y no se podria
     * */
    double calculateDicount(Order order, double totalPrice){
        double result = totalPrice;
        if(order == null || order.getPrice() == null){ //programacion defensiva
            return result;
        }
        if(order.getPrice() > 100){
            result += order.getPrice() * order.getOffer();  // Ya no se sobreescribe el parametro
        }
        return result;
    }
}
