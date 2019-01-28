package lesson_4.Task_1;

import java.util.Random;

public class Main {
    enum Name {
        Liam,
        Noah,
        William,
        James,
        Logan,
        Benjamin,
        Mason,
        Elijah,
        Oliver,
        Jacob,
        Emma,
        Olivia,
        Ava,
        Isabella,
        Sophia,
        Mia,
        Charlotte,
        Amelia,
        Evelyn,
        Abigail
    }

    enum Surname {
        Smith,
        Johnson,
        Williams,
        Jones,
        Brown,
        Davis,
        Miller,
        Wilson
    }

    enum Style {
        Modernism,
        Impressionism,
        Abstract_art,
        Expressionism,
        Cubism,
        Surrealism
    }

    enum Instrument {
        Keyboard,
        Piano,
        Recorder,
        Classical_guitar,
        Drum_kit,
        Electric_guitar,
        Violin,
        Percussion
    }

    private static final int ARRAY_SIZE = 5;

    public static void main(String[] args) {
        Name[] names = Name.values();
        Surname[] surnames = Surname.values();
        Style[] styles = Style.values();
        Instrument[] instruments = Instrument.values();

        int namesEnumSize = names.length;
        int surnamesEnumSize = surnames.length;
        int stylesEnumSize = styles.length;
        int instrumentsEnumSize = instruments.length;

        Random random = new Random();
        Person[] persons = new Person[ARRAY_SIZE];

        for (int i = 0; i < persons.length; i++) {
            persons[i] = createPerson(random, namesEnumSize, surnamesEnumSize, stylesEnumSize, instrumentsEnumSize, names, surnames, styles, instruments);
        }

        getPersons(persons);
    }

    private static Person createPerson(Random random, int namesEnumSize, int surnamesEnumSize, int stylesEnumSize, int instrumentsEnumSize, Name[] names, Surname[] surnames, Style[] styles, Instrument[] instruments) {
        String name = String.valueOf(names[random.nextInt(namesEnumSize)]);
        String surname = String.valueOf(surnames[random.nextInt(surnamesEnumSize)]);

        if (random.nextInt()%2 == 0) {
            String style = String.valueOf(styles[random.nextInt(stylesEnumSize)]);
            return new Artist(name, surname, style);
        } else {
            String instrument = String.valueOf(instruments[random.nextInt(instrumentsEnumSize)]);
            return new Musician(name, surname, instrument);
        }
    }

    private static void getPersons(Person[] persons) {
        for (Person person : persons) {
            if (person instanceof Artist) {
                System.out.println(person + " draws in " + ((Artist) person).getStyle() + " style");
            } else if (person instanceof Musician) {
                System.out.println(person + " play on " + ((Musician) person).getInstrument());
            }
        }
    }
}
