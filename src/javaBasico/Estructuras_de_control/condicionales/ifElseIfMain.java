package javaBasico.Estructuras_de_control.condicionales;

public class ifElseIfMain {
    public static void main(String[] args) {

        double paga = 9000;

        boolean pagaJunior = paga <= 3000;
        boolean pagaSemiSinior = paga <= 5000 && paga > 3000;

        if(pagaJunior){
            System.out.println("La paga es de Junior");
        }else if(pagaSemiSinior){
            System.out.println("La paga es de Semi Senior");
        }else{
            System.out.println("La paga es de Sinior");
        }


    }
}
