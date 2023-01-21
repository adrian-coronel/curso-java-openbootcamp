package javaAvanzado.Refactoring;

public class ConstructorLargoBuilder {

    ConstructorLargo constructorLargo;

    private ConstructorLargoBuilder(){}

    public ConstructorLargoBuilder(String nombre){
        constructorLargo = new ConstructorLargo();
        constructorLargo.setNombre(nombre);
    }

    public ConstructorLargoBuilder conApellido(String apellido){
        constructorLargo.setApellido(apellido);
        return this;
    }

    public ConstructorLargoBuilder conEdad(Integer edad){
        constructorLargo.setEdad(edad);
        return this;
    }

    public ConstructorLargoBuilder conDni(String dni){
        constructorLargo.setDni(dni);
        return this;
    }

    public ConstructorLargo build(){
        return this.constructorLargo;
    }
}
