package javaBasico.TiposdeDatosAvanzados.BigDecimal;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        /**
         * Cuando se trabaja con datos FINANCIEROS no utilizar
         * DOUBLE o FLOAT, pues los valores financieros muchas veces se
         * trabajan con grandes decimales y requieren una alticima PRESICION
         * */
        //ERROR QUE DAN: 1.0000001
        System.out.println("SIN PRESICIÓN: " + (0.1f+0.1f));



        //COMO SOLUCIONAR ESTO: usando la clase BIGDECIMAL
        BigDecimal valorA = new BigDecimal(0.1f);

        //valorA *= 4; -> NO PERMITE, YA QUE TIENE METODOS O FORMAS,EN QUE LO PERMITE

        BigDecimal valorB = new BigDecimal(0.1f);
        //valorA.multiply(valorB); //El resultado se almacena en "valorA"

        //SUMAR -> valor.add(valor a sumar)
        BigDecimal resutlado = valorA.add(valorB); //Necesitamos una variable resultado para que no machaque la presicion
        System.out.println("CON PRESICIÓN: " + resutlado.toString());
    }
}
