package javaAvanzado.PatronesDeDiseño.PatronesCreacionales.Singleton;

public class Main {
    public static void main(String[] args) {
        //Singleton singleton = new Singleton();
        //singleton.setContador(15);
        //System.out.println(singleton.getContador());
        //System.out.println(singleton); // -> javaAvanzado.PatronesDeDiseño.PatronesCreacionales.Singleton.Singleton@677327b6 diferente instancia

        //Singleton singleton2 = new Singleton();
        //singleton2.setContador(20);
        //System.out.println(singleton2.getContador());
        //System.out.println(singleton2); // -> javaAvanzado.PatronesDeDiseño.PatronesCreacionales.Singleton.Singleton@14ae5a5 diferente instancia

        /**El patron singleton trata de evitar que se creen nuevas instacias, es decir
         * que se opere con una sola instancia*/
        Singleton singleton3 = Singleton.getInstance();
        singleton3.setContador(15);
        System.out.println(singleton3.getContador());
        System.out.println(singleton3); //-> Singleton@677327b6

        Singleton singleton4 = Singleton.getInstance();
        singleton4.setContador(20);
        System.out.println(singleton4.getContador());
        System.out.println(singleton4); //-> Singleton@677327b6
    }
}
