package ru.mera.chumakova.task7.subtask2;

public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T unbox() {
        return value;
    }

    public static void main(String[] args) {
        Box box1 = new Box("Abc");
        Box box2 = new Box(123);
        AnotherClass obj = new AnotherClass("value");
        Box box3 = new Box(obj);
        System.out.println(box1.unbox());
        System.out.println(box2.unbox());
        System.out.println(box3.unbox().toString());
    }
}
