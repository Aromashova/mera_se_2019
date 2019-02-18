package ru.mera.grishina.task7_1;

import java.util.Random;

public class Middle {

    private static Random rand = new Random();

    private static <T> T getMiddle(T... elements) {
        final int i = elements.length;
        T middle;
        if ((i % 2) > 0) {
            middle = elements[((int) Math.floor(i / 2))];
        } else {
            if ((new Random().nextInt(2)) == 0) {
                middle = elements[(i / 2)];
            } else {
                middle = elements[(i / 2) - 1];
            }
        }
        return middle;
    }

    public static void main(String[] args) {
        System.out.println(getMiddle("36", "378", "5798"));
        System.out.println(getMiddle(245, 63, 334, 87));
    }
}
