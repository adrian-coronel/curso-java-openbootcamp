package javaAvanzado.Refactoring.Ejercicio;

public class EspadaFrostmourne implements Espada {

    @Override
    public int golpeVorpal() {
        System.out.println("EspadaFrostmourne: Golpe voral");
        return 20;
    }

    @Override
    public int punzada() {
        System.out.println("EspadaFrostmourne: Punzada");
        return 10;
    }

    @Override
    public void cubrir() {
        System.out.println("EspadaFrostmourne: Crubriendo");
    }
}
