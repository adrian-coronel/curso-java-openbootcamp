package javaBasico.Concepto.tecnicas_de_refactoring.consolidatecondisional.bad;

public class Main {
    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    public double calculateExtraSalary(){
        double result = 0;
        if(seniority < 1){
            return 0;
        }
        if(education < 1){
            return 0;
        }
        if(incidents > 10){
            return 0;
        }
        if(!certification){
            return 0;
        }
        return result;
    }

    private double promedio;
    private double nota1;
    private double nota2;
    private int incidentes;

    //MI EJEMPLO
    public double calcularPromedio(){
        double result = 0;
        if(nota1 > 12){
            return 0;
        }
        if(nota2 > 12){
            return 0;
        }
        if(incidentes > 10){
            return 0;
        }
        return result;
    }

}
