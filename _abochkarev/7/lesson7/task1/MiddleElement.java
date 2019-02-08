package lesson7.task1;

import java.util.Random;

public class MiddleElement {
    private static Random random = new Random();

    private static <T> T getMiddle(T... elements) {
        int index = elements.length / 2;
        T result;
        if (elements.length % 2 == 0) {
            if (random.nextBoolean()) {
                result = elements[index - 1];
            } else {
                result = elements[index];
            }
        } else {
            result = elements[index];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getMiddle("1", "2", "3"));
        System.out.println(getMiddle(1, 2, 3, 4));
        System.out.println(getMiddle("1", "2", "3", "4", "5"));
        System.out.println(getMiddle(1));
        System.out.println(getMiddle(1, 2));
    }
}
