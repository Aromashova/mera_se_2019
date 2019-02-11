package ru.mera.romazanova.task7_2;

public class Test7_2 {
    public static void main(String[] args) {
        final Box<String> str = new Box("A");
        final String value = str.unbox();

        final Box<Integer> numb = new Box(42);
        final Integer intValue = numb.unbox();

    }
}
