package ru.mera.katisheva.task3;//package task3;

public class Person {
    private String Name;
    private String Surname;

    Person(){
        Name="Undefined";
        Surname="Undefined";
    }

    Person(String name, String surname){
        Name=name;
        Surname=surname;
    }

    Person(Person person){
        Name=person.Name;
        Surname=person.Surname;
    }

    String getName() {
        return Name;
    }

    String getSurname() {
        return Surname;
    }
    /*public void printPerson(){
        System.out.println("\n"+Name+" "+Surname);
    }*/
}
