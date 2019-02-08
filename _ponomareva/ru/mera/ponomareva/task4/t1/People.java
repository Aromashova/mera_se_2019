package ru.mera.ponomareva.task4.t1;

import java.util.Random;

public class People {
    public static void main(String[] args){
    Person[] persons = new Person[6];

    String[] names = {"John", "Adam", "Bart", "Homer", "Liza", "Maggi"};
    String[] surnames = {"Smith", "Johnson", "Williams", "Jones", "Anderson", "Thomas"};
    String[] styles = {"Pop Art", "Avant-garde", "Classicism"};
    String[] instruments = {"Piano", "Guitar", "Drum" };


        Random random = new Random();
        for (int i = 0; i < persons.length; i++) {
            if (i%2!=0)
                persons[i] = new Artist(names[random.nextInt(6)], surnames[random.nextInt(6)], styles[random.nextInt(3)]);
            else
                persons[i] = new Musician(names[random.nextInt(6)], surnames[random.nextInt(6)], instruments[random.nextInt(3)]);
        }

        for (Person person : persons) {
            if (person instanceof Artist)
                System.out.println(person.toString() + " draws in style " + ((Artist) person).getStyle());
            else
                System.out.println(person.toString() + " plays on " + ((Musician)person).getInstrument());

        }
    }
}
