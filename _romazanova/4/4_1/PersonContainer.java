package ru.mera.romazanova.task4;

import java.util.Random;

import ru.mera.romazanova.task4.Artist.Style;
import ru.mera.romazanova.task4.Musician.Instrument;


public class PersonContainer {
    static final int CONTAINER_SIZE = 10;
    private Person [] personContainer = new Person [CONTAINER_SIZE];

    PersonContainer (){
        Person randomPerson;
        for (int i = 0; i < personContainer.length; i++){
            if ((new Random().nextInt(2)) == 0){
                randomPerson = new Artist();
            }
            else {
                randomPerson = new Musician();
            }
            personContainer [i] = randomPerson;
        }
    }

    public Person getPerson (int index){
        if (index < personContainer.length){
            return personContainer [index];
        } 
        else 
            return null;
    }
    public static int getContainerSize (){
        return CONTAINER_SIZE;
    }
}