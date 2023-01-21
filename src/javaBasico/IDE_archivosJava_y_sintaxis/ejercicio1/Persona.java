package javaBasico.IDE_archivosJava_y_sintaxis.ejercicio1;

public class Persona {


    private String firstName;
    private String lastName;
    private int age;
    private double height;
    private double weight;


    public void imprimir(){
        System.out.println("His name is: "+firstName);
        System.out.println("His last name is: "+lastName);
        System.out.println("Your age is: "+age);
        System.out.println("His height is: "+height);
        System.out.println("His weight is: "+weight);
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
