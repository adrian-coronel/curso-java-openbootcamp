package javaBasico.Concepto.conceptos;

public class TryCatchMain {
    public static void main(String[] args) {
        //Permite que a la hora que se ejecute operación y esta lance un error, podremos capturarla

        try{
            //AQUI PONDREMOS OPERACIONES QUE PUEDEN DAR PROBLEMAS

            int result = 5/ 0; //Esta es una excepcion, no se puede dividir
        }catch (ArithmeticException e){
            //AQUI PODREMOS MANEJAR LA EXCEPTION

            e.printStackTrace();
        }finally {
            //AQUI CERRAMOS LOS RECURSOS(Conexiones o borrar archivos,etc)
            System.out.println("Cierre de recursos");
        }

        System.out.println("fin");
    }
}
