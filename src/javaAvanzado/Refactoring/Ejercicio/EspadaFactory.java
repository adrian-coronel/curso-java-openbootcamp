package javaAvanzado.Refactoring.Ejercicio;

public class EspadaFactory {

    private Espada espada;

    private EspadaFactory(){}

    public EspadaFactory(String nombreEspada){
        switch (nombreEspada) {
            case "Excalibur":
                espada = new EspadaExcalibur();
                break;
            case "Frostmourne":
                espada = new EspadaFrostmourne();
                break;
            case "IraDelRey":
                espada = new EspadaIraDelRey();
                break;
        }
    }

    public int golpeVorpal() {
        return espada.golpeVorpal();
    }

    public int punzada() {
        return espada.punzada();
    }

    public void cubrir() {
        espada.cubrir();
    }

}
