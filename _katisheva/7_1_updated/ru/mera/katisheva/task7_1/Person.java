package ru.mera.katisheva.task7_1;

class Person {
    String name;
    Person(String nameValue){
        name=nameValue;
    }

    @Override
    public String toString() {
        return name.toString();
    }
}
