package ru.mera.romazanova.task4;

import java.util.Random;

public class Musician extends Person {

    private Instrument[] allInstrument = Instrument.values();
    private final Instrument randomInstrument = allInstrument[new Random().nextInt(allInstrument.length)];

    enum Instrument {
        PIANO("piano"),
        GUITAR("guitar"),
        DRUM("drum"),
        VIOLIN ("violin");

        private String value;
        Instrument(String value){
        this.value = value;
        }

        public String getValue() {
        	return value;
        }
    }

    public Instrument getInstrument (){
        return randomInstrument;
    }
}
