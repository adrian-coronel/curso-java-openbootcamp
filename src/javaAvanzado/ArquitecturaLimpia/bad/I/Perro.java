package javaAvanzado.ArquitecturaLimpia.bad.I;
/**
 * Aqui tenemos un error en la interfaz AnimalVolador, ya que nos esta diciendo que todos
 * los animales pueden VOLAR, así como aquí
 * */
public class Perro implements Animal{
    @Override
    public boolean beber() {
        return false;
    }

    @Override
    public boolean volar() { //Los perros NO PUEDEN VOLAR
        return false;
    }
}
