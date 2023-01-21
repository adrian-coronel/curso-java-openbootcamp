package javaAvanzado.Refactoring.Ejercicio;

public class EspadaIraDelRey implements Espada {

    @Override
    public int golpeVorpal() {
        System.out.println("EspadaIraDelRey: Golpe voral");
        return 10;
    }

    @Override
    public int punzada() {
        System.out.println("EspadaIraDelRey: Punzada");
        return 5;
    }

    @Override
    public void cubrir() {
        System.out.println("EspadaIraDelRey: Crubriendo");
    }
}
