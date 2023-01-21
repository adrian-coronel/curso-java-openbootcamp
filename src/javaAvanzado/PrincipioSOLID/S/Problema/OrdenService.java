package javaAvanzado.PrincipioSOLID.S.Problema;

import java.io.FileInputStream;
import java.io.FileWriter;

public class OrdenService {

    public void guardarOrden(Orden orden){
        try{
            /*
            * Si nos damos cuenta en esta clase estamos dandole 4 responsabilidades.
            * 1. guardar la orden
            * 2. insertar la orden
            * 3. crear la factura
            * 4. enviar un email al usuario
            * Entonces cada que queramos cambiar algo tendriamos que venir acá, por lo que sería dificil
            * entender lo que se realizo, pues estas lineas pueden crecer hasta un punto desproporcionado.
            * */
            this.insertarOrden(orden);
            Factura factura = this.crearFactura(orden);
            this.emailFactura(factura);
        } catch (Exception e){
            e.getMessage();
        }
    }

    public boolean insertarOrden(Orden orden){
        // Codigo de inserción de la orden en la base de datos
        return true;
    }
    public Factura crearFactura(Orden orden){
        //Codigo para crear una factura apartir de la Orden
        return new Factura();
    }
    public boolean emailFactura(Factura factura) {
        //Codigo para enviar un email de la Factura al usuario
        return true;
    }

    public class Factura{

    }
    public class Orden{

    }

}
