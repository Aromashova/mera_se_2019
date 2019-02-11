package lesson7.task2;

public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T unbox() {
        return value;
    }
}
