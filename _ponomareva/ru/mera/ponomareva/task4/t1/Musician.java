package ru.mera.ponomareva.task4.t1;

public class Musician extends Person {

    private String instrument;

    public Musician(String name, String surname, String instrument) {
        super(name, surname);
        this.instrument = instrument;
    }

    public String getInstrument() {
        return instrument;
    }
}
