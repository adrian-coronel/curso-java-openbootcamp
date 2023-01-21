package javaAvanzado.PatronesDeDiseño.PatronesCreacionales.Prototype;

public class Main {
    public static void main(String[] args) {
        //PRIMERA FORMA
        Coche coche = new Coche();
        coche.setPuertas(4);
        coche.setModelo("Corolla");
        coche.setMarca("Toyota");
        System.out.println(coche);

        //Es como heredar con los valores existentes
        Coche cocheClon = coche.clonar(); //Copio de esta manera
        cocheClon.setModelo("Supra");
        System.out.println(cocheClon);

        //SEGUNDA FORMA
        Coche_Forma2 cocheForma2 = new Coche_Forma2();
        cocheForma2.setPuertas(2);
        cocheForma2.setModelo("Spider");
        cocheForma2.setMarca("Lamborghini");
        System.out.println(cocheForma2);

        //Clon
        try {

            Coche_Forma2 cocheForma2CLON = cocheForma2.clonar();
            cocheForma2CLON.setPuertas(0);
            System.out.println(cocheForma2CLON);

        } catch (CloneNotSupportedException e) {
            System.out.println("No se pudo Clonar");
            throw new RuntimeException(e);
        }

    }
}
