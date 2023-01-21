package javaBasico.Interfaces.ejercicio;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save(Coche coche) {
        System.out.println("SE GUARDO EL COCHE");
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("SE RETORNA UNA LISTA DE COCHES");
        return null;}

    @Override
    public void delete(int index) {
        System.out.println("SE ELIMINO EL COCHE EN LA POSICICON "+index);
    }

}
