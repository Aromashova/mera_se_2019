package task7_1;

import java.util.Random;

class MiddleElement <Element> {
    public Element middleElement (Element ...elements){
        final int size = elements.length;
        Random random = new Random();
        Element middleElement;
        int index=size/2;
        try{
        if(size%2==0) {
            if (random.nextBoolean()) {
                middleElement = elements[index];
            } else {
                middleElement = elements[index - 1];
            }
        } else {
            middleElement = elements[index];

        }
        System.out.println("Middle element of the list is " + middleElement + ".");
        return middleElement;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Empty list.");
            return (Element) e;
        }
    }
}
