package ru.mera.grishina.task4;

import java.lang.*;
import java.util.Random;

public class WhoIsWho {
    public Person[] persons = new Person[1];
    private Integer i = 0;

    public Person[] addPerson(Person someone) {
        if (i < persons.length) {
            persons[i++] = someone;
        }
        return persons;
    }

    public static void main(String[] args) {
        WhoIsWho all = new WhoIsWho();
        Person p1 = new Person("Van", "Gogh");
        Person p2 = new Person("Oscar-Claude", "Monet");
        Person p3 = new Person("Marc", "Chagall");
        Person p4 = new Person("Ludwig van", "Beethoven");
        Person p5 = new Person("Petr", "Chaykojvsky");

        Person[] array = new Person[] {p1, p2, p3, p4, p5};
        String[] styles = new String[] {"post-impressionism", "impressionism", "avant-garde", "abstractionism", "underground"};
        String[] instruments = new String[] {"violin", "piano", "accordion", "drum", "saxophone"};

        // Sorting musician or artist
        Person man;
        Random rand = new Random(System.currentTimeMillis());

        for (int i = 0; i < 5; i++) {
            Person person = array[i];
            String style = styles[i];
            String instrument = instruments[i];
            if (rand.nextBoolean()) {
                man = new Artist(person, style);
            } else {
                man = new Musician(person, instrument);
            }
            all.addPerson(man);

            if (man instanceof Artist) {
                System.out.format("%s %s %s draws in style %s.\n", man.getArea(), man.getName(), man.getSurname(), ((Artist) man).getStyle());
            }
            if (man instanceof Musician) {
                System.out.format("%s %s %s plays on %s.\n", man.getArea(), man.getName(), man.getSurname(), ((Musician) man).getInstrument());
            }
        }
    }
}