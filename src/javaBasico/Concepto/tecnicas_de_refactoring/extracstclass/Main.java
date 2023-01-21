package javaBasico.Concepto.tecnicas_de_refactoring.extracstclass;

import javaBasico.Concepto.tecnicas_de_refactoring.extracstclass.good.Address;
import javaBasico.Concepto.tecnicas_de_refactoring.extracstclass.good.Person;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        address.setCity("Lima");
        address.setCountry("Perú");
        address.setPostalCode("07001");
        address.setStreet("Av 200 Millas - Paz y Unión");
        address.setDoor("17");

        Person person = new Person();
        person.setId(1L);
        person.setFirstName("Adrian");
        person.setLastName("Coronel");
        person.setAge(19);
        person.setAddress(address);
    }
}
