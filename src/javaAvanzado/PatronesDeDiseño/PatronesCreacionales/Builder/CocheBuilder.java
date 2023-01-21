package javaAvanzado.PatronesDeDiseño.PatronesCreacionales.Builder;

public class CocheBuilder {

    Vehiculo vehiculo;

    public CocheBuilder(String marca){
        vehiculo = new Vehiculo();
        vehiculo.marca = marca;
    }

    //El metodo retornará su propia instancia (PROGRAMACIÓN FLUIDA)
    public CocheBuilder setPuertas(int puertas){
        vehiculo.puertas = puertas;
        return this; //Devuelve su propia clase
    }
    public CocheBuilder setMotor(String motor){
        vehiculo.motor = motor;
        return this; // Se conoce como propiedades de fluidez
    }
    public CocheBuilder setTipo(String tipo){
        vehiculo.tipo = tipo;
        return this;
    }
    //Metodo por default cuando se usa BUILDER
    public Vehiculo build(){
        //Cuando invoque al constructor se crea el objeto y con el metodo build lo RETORNA
        return this.vehiculo;
    }
}
