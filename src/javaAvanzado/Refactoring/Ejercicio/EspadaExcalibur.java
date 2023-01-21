package javaAvanzado.Refactoring.Ejercicio;

public class EspadaExcalibur implements Espada {
    @Override
    public int golpeVorpal() {
        System.out.println("EspadaExcalibur: Golpe voral");
        return 30;
    }

    @Override
    public int punzada() {
        System.out.println("EspadaExcalibur: Punzada");
        return 20;
    }

    @Override
    public void cubrir() {
        System.out.println("EspadaExcalibur: Crubriendo");
    }
}
