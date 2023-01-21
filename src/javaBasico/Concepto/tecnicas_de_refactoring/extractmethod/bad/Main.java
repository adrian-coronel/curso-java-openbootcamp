package javaBasico.Concepto.tecnicas_de_refactoring.extractmethod.bad;

public class Main {

    public void printHTML(){
        printHead();
        printBody();
        System.out.println("This is the footer");
        System.out.println("script");
        System.out.println("copyright");
    }

    private void printBody(){}
    private void printHead(){}
}
