package ru.mera.ponomareva.task4.t1;

public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString(){
        return name+" "+surname;
    }
}
