package javaAvanzado.Funciones;

public class Main2 {
    public static void main(String[] args) {
        int[] aiNumeros = {1,2,3,4,5,6};
        int resultado = sumarNumeros(aiNumeros);

        System.out.println(     sumarInfinitamente(1,2,3,4,5)     );
        System.out.println(     sumarInfinitamente(5,5,5)     );

        /*En vez de crear un metodo con los parametros para crear un user -> addUsers(String,String,int),
        pasamos el objeto para disminuir los parametros en la funcion -> addUsers(usuario)*/

        Usuario usuario = new Usuario("Adrian","Coronel",19);

        Usuarios usuarios = new Usuarios();
        try {
            usuarios.addUsers(usuario);
            usuarios.addUsers(usuario); //Aqui arrojo la exception
        } catch (UserException e) {
            System.out.println(e.getMessage());
        }
    }

    //Funcion MONÁBICA
    private static int sumarNumeros(int[] aiNumeros) {
        int resultado = 0;
        for (int numero : aiNumeros){
            resultado+=numero;
        }
        return resultado;

        //Opcion 2:
        /*int resultado2 = Arrays.stream(aiNumeros).reduce(0,(a,b) -> a + b);
        return resultado2;*/
    }

    //Esta funcion acepta infinidad de parametros
    private static int sumarInfinitamente(int ...numeros){ //Anteponiendo "..." permitirá ingresar parametros indefinidamente
        int resultado = 0;
        for (int numero : numeros){
            resultado += numero;
        }
        return resultado;
    }


}
