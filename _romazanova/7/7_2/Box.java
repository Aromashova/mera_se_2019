package ru.mera.romazanova.task7_2;

public class Box<AnyType> {

    private final AnyType value;

    public Box(AnyType value) {
        super();
        this.value = value;
    }

    private AnyType getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "The value of the item :  " + getValue();
    }

    public AnyType unbox() {
        System.out.println(toString());
        return value;
    }

}
