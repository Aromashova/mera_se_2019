package task7_2;

public class Box <Type>{
    private Type value;

    public Box(Type value) {
        this.value = value;
    }

    public Type unbox() {
        return value;
    }
}
