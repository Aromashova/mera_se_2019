package ru.mera.chumakova.task4;

import java.util.Random;

public class DefinePerson {
    public static void main(String[] args) {
        String[] names = new String[5];
        String[] surnames = new String[5];
        String[] styles = new String[5];
        String[] instruments = new String[5];

        Person[] persons = new Person[10];

        for(int i=0; i<names.length; i++) {
            names[i] = "Name" + i;
        }

        for(int i=0; i<surnames.length; i++) {
            surnames[i] = "Surname" + i;
        }

        for(int i=0; i<styles.length; i++) {
            switch (i) {
                case 0:
                   styles[i]= "пейзаж";
                   break;
                case 1:
                    styles[i]= "натюрморт";
                    break;
                case 2:
                    styles[i]= "портрет";
                    break;
                case 3:
                    styles[i]= "графика";
                    break;
                case 4:
                    styles[i]= "анимализм";
                    break;
            }
        }

        for(int i=0; i<instruments.length; i++) {
            switch (i) {
                case 0:
                    instruments[i]= "фортепиано";
                    break;
                case 1:
                    instruments[i]= "скрипка";
                    break;
                case 2:
                    instruments[i]= "гитара";
                    break;
                case 3:
                    instruments[i]= "виолончель";
                    break;
                case 4:
                    instruments[i]= "флейта";
                    break;
            }
        }

        Random rand = new Random();
        for(int i=0; i<persons.length; i++) {
            if (i%2 == 0) {
                persons[i] = new Musician(names[rand.nextInt(5)], surnames[rand.nextInt(5)], instruments[rand.nextInt(5)]);
            } else {
                persons[i] = new Artist(names[rand.nextInt(5)], surnames[rand.nextInt(5)], styles[rand.nextInt(5)]);
            }
        }

        for(Person person: persons) {
            if(person instanceof Musician) {
                System.out.println(person.toString()+" plays on " + ((Musician) person).getInstrument());
            } else {
                System.out.println(person.toString()+" draws in style  " + ((Artist) person).getStyle());
            }

        }

    }
}
