package javaAvanzado.PatronesDeDiseño.PatronesCreacionales.Singleton;

public class MainAplicacion {
    public static void main(String[] args) {

        //Instancia compartida
        Aplicacion app =  Aplicacion.getInstance(); //new Apliccion()
        Aplicacion app2 =  Aplicacion.getInstance(); // app2 = app

        app.Run();
        app2.Run();

        System.out.println(app);
        System.out.println(app2);

    }
}
