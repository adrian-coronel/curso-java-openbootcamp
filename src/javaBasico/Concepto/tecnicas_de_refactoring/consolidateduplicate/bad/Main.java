package javaBasico.Concepto.tecnicas_de_refactoring.consolidateduplicate.bad;

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
            sendMessage(); //Metodo que se repite en la condición
        }
        else{
            result=0;
            sendMessage(); //Metodo que se repite en la condición
        }
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
