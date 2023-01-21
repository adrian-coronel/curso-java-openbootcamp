package javaBasico.Concepto.tecnicas_de_refactoring.consolidateduplicate.good;

public class Main {
    private double extraSalary;
    private int seniority;
    private int education;
    private int incidents;
    private boolean certification;

    public double calcularSalary(){
        double result = 0;
        if(isEligibleExtraSalary()){
            result = 500;
        } else{
            result=0;
        }
        sendMessage(); //Ahora el metodo no se repite
        return result;
    }

    //enviarMensaje
    private void sendMessage(){
        //send email
        //send sntp
        System.out.println("Sed");
    }

    private boolean isEligibleExtraSalary(){
        boolean estudios = seniority < 1 || education < 1; //Categoria
        boolean experiencia = incidents > 10   || !certification;
        return estudios || experiencia;
    }
}
