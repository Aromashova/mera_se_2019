package ru.mera.romazanova.task4;

import java.util.Random;

import ru.mera.romazanova.task4.Musician.Instrument;

public class Artist extends Person {

    private Style[] allStyles = Style.values();
    private final Style randomStyle = allStyles[new Random().nextInt(allStyles.length)];

    enum Style {
        MODERN("modern"),
        CLASSIC("classic"),
        CUBISM("ñubism"),
        IMPRESSIONISM("impressionism");

    	private String value;
        Style(String value){
	        this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    public Style getStyle (){
        return randomStyle;
    }
}
