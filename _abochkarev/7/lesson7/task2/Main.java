package lesson7.task2;

public class Main {
    public static void main(String[] args) {

        Box<String> str = new Box<>("string");
        String strValue = str.unbox();
        System.out.println("string inside Box: " + strValue);

        Box<Integer> number = new Box<>(42);
        Integer intValue = number.unbox();
        System.out.println("integer inside Box: " + intValue);
    }
}
