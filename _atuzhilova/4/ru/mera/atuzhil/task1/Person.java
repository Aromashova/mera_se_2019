package ru.mera.atuzhil.task1;

public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Name: " + this.name +", surname: " + this.surname;
    }
}