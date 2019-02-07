package ru.mera.grishina.task4;

public class Musician extends Person{
    private String instrument;

    public Musician(Person man, String instrument) {
        super(man.getName(), man.getSurname());
        this.instrument = instrument ;
    }

    public String getInstrument() {
        return instrument;
    }

    @Override
    public String getArea() {
        return "Musician";
    }
}
