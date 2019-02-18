package ru.mera.grishina.task7_2;

/**
 * Box class - a container that can store one value of any type.
*/

public class Box <T> {
    private T value;

    // Single parameter constructor - the value we want to store
    public Box(T value) {
        this.value = value;
    }

    // Method returns the stored value
    public T unbox() {
        return value;
    }

    public static void main(String[] args) {
        Box<String> str = new Box<> ("A");
        String value = str.unbox();
        System.out.println("String: " + value);

        Box <Integer> numb = new Box<> (42);
        Integer intValue = numb.unbox();
        System.out.println("Integer: " + intValue);
    }
}
