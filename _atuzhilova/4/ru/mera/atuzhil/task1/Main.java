package ru.mera.atuzhil.task1;

import java.time.LocalDateTime;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] names = new String[] {"A", "B", "C", "D", "E"};
        String[] surnames = new String[] {"a", "b", "c", "d", "e"};
        String[] styles = new String[] {"!", "@", "#", "$", "%"};
        String[] instruments = new String[] {"1", "2", "3", "4", "5", "6", "7"};

        int count = 5; //125;
        Person[] persons = new Person[count];
        Random rand = new Random((long) LocalDateTime.now().getNano());
        for (int i = 0; i < count; i++) {
            String name = names[rand.nextInt(names.length)];
            String surname = surnames[rand.nextInt(surnames.length)];
            String style = styles[rand.nextInt(styles.length)];
            String instrument = instruments[rand.nextInt(instruments.length)];

            boolean isArtist = rand.nextBoolean();
            persons[i] = isArtist ?  new Artist(name, surname, style)  :  new Musician(name, surname, instrument);
            /*
            if(isArtist){
                persons[i] = new Artist(name, surname, style);
            }
            else {
                persons[i] = new Musician(name, surname, instrument);
            }
            */
        }

        for (Person person: persons) {
            if (person instanceof Artist) {
                System.out.println(person.toString() + ", paints in style: " + ((Artist) person).getStyle());
            } else if (person instanceof  Musician) {
                System.out.println(person.toString() + ", plays on: " + ((Musician) person).getInstrument());
            }
        }
    }
}