package lesson_4.Task_1;

public class Musician extends Person {
    private String instrument;

    Musician(String name, String surname, String instrument) {
        super(name, surname);
        this.instrument = instrument;
    }

    String getInstrument() {
        return instrument;
    }
}
