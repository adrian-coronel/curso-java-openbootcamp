package javaBasico.Concepto.tecnicas_de_refactoring.extractmethod.good;

public class Main {

    public void printHTML(){
        printHead();
        printBody();
        //sobreando el codigo, dar click derecho y seleccionar "extrac method"
        printFooter();
    }

    private void printFooter() {
        System.out.println("This is the footer");
        System.out.println("script");
        System.out.println("copyright");
    }

    private void printBody(){}
    private void printHead(){}
}
