package ru.mera.grishina.task4;

public class Artist extends Person {
    private String style;

    public Artist(Person man, String style) {
        super(man.getName(), man.getSurname());
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public String getArea() {
        return "Artist";
    }
}
