package javaBasico.Interfaces.ejercicio;

public class Main {

    static CocheCRUD cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {

        cocheCRUD.findAll();
        cocheCRUD.save(new Coche());
        cocheCRUD.delete(0);

    }

}
