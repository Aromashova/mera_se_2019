package ru.mera.romazanova.task7_1;

import java.util.Random;

class MiddleElement<TypeOfElement> {

    public TypeOfElement middleElement(TypeOfElement... elements) {
        final int numberOfElements = elements.length;

        TypeOfElement middleElement;

        if ((numberOfElements % 2) > 0) {
            middleElement = elements[((int) Math.floor(numberOfElements / 2))];
        } else {
            if ((new Random().nextInt(2)) == 0) {
                middleElement = elements[(numberOfElements / 2)];
            } else {
                middleElement = elements[(numberOfElements / 2) - 1];
            }
        }
        System.out.print("The middle element is: " + middleElement);
        return middleElement;
    }
}
