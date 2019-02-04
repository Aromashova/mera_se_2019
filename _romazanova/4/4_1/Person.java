package ru.mera.romazanova.task4;

import java.util.Random;

public class Person {

    private Name[] allNames = Name.values();
    private final Name randomName = allNames[new Random().nextInt(allNames.length)];
    private SurName [] allSurNames = SurName.values();
    private final SurName randomSurName = allSurNames[new Random().nextInt(allSurNames.length)];


    enum SurName {
        IVANOV("Ivanov"),
        PETROV("Petrov"),
        SIDOROV("Sidorov"),
        SMIRNOV("Smirnov");

        private String value;
        SurName(String value){
            this.value = value;
        }
    }	
    enum Name {
        IVAN("Ivan"),
        PETR("Petr"),
        SIDOR("Sidor"),
        OLEG("Oleg");

        private String value;
        Name(String value){
            this.value = value;
        }
    }
    @Override
    public String toString() {
        return randomName.value + " " + randomSurName.value;
    }
}