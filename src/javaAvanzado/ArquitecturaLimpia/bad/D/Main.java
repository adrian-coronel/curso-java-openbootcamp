package javaAvanzado.ArquitecturaLimpia.bad.D;

public class Main {
    public static void main(String[] args) {
        Oracle oracle = new Oracle();
        MySQL mySQL = new MySQL();

        SOLIDD solidd = new SOLIDD();
        solidd.obtenerData(oracle);
        solidd.enviarData(oracle);
        /* Si yo más adelante quiero cambiarme a MYSQL, podría hacerlo
        * sin causar errores, ya que las 2 implementan de la misma INTERFAZ */

        solidd.enviarData(mySQL);
    }
}
