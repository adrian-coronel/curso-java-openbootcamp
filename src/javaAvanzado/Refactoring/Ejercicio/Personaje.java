package javaAvanzado.Refactoring.Ejercicio;

public class Personaje implements Habilidades{

    private String nombre;
    private Integer nivel;
    private EspadaFactory espada;

    public Personaje(){}
    public Personaje(String nombre, Integer nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public void setEspada(String nameEspada) {
        espada = new EspadaFactory(nameEspada);
    }

    @Override
    public void defenderse() {
        boolean tengoEspada = espada != null;
        if (tengoEspada) {
            espada.cubrir();
        } else{
            System.out.println("Defenza con brazos");
        }
    }

    @Override
    public int atacarConEspada(String tipoAtaque) {
        if (espada == null){return 0;}
        if (tipoAtaque.equalsIgnoreCase("Punzada")){
            return espada.punzada();
        }
        return espada.golpeVorpal();
    }

    @Override
    public int golpear() {
        return GOLPE_PUÑO;
    }
}
