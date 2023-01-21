package javaBasico.Concepto.tecnicas_de_refactoring.consolidatecondisional.good;

public class Main {
    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    public double calcularSalary(){
        double result = 0;
        if(!isEligibleExtraSalary()){
            return result;
        }
        result +=5;
        return result;
    }

    private boolean isEligibleExtraSalary(){
        boolean estudios = seniority < 1 || education < 1; //Categoria
        boolean experiencia = incidents > 10   || !certification;
        return estudios || experiencia;
    }


    //MI EJEMPLO
    private double promedio;
    private double nota1;
    private double nota2;
    private int incidentes;

    public boolean esAprobado(){
        boolean esAprobado = true;
        if(!verificarAlumno()){
            return false;
        }
        return esAprobado;
    }

    private boolean verificarAlumno(){
        boolean estudios = nota1 > 11 || nota2 > 11;
        boolean comportamiento = incidentes < 10;
        return estudios || comportamiento;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public int getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(int incidentes) {
        this.incidentes = incidentes;
    }
}
