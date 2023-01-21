package javaBasico.Concepto.tecnicas_de_refactoring.consolidatecondisional;

public class Main {
    public static void main(String[] args) {
        javaBasico.Concepto.tecnicas_de_refactoring.consolidatecondisional.good.Main good = new javaBasico.Concepto.tecnicas_de_refactoring.consolidatecondisional.good.Main();
        good.setIncidentes(10);
        good.setNota1(11);
        good.setNota2(11);
        System.out.println(good.esAprobado());
    }
}
