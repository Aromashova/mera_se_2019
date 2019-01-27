package lesson_4.Task_1;

public class Artist extends Person {
    private String style;

    Artist(String name, String surname, String style) {
        super(name, surname);
        this.style = style;
    }

    String getStyle() {
        return style;
    }
}
