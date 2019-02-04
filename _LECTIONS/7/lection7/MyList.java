package lection7;

public class MyList<ELEMENT_TYPE/*, ANOTHER_TYPE*/>  {

    private static int START_CAPACITY = 100;

    private Object[] objects = new Object[START_CAPACITY];
    int index = 0;

    public void addObject(ELEMENT_TYPE msg) {
        if (msg == null) {
            System.out.println("Ignore  null  message");
            return;
        }

        if (index == objects.length) {
            Object[] tempArray = new Object[objects.length + START_CAPACITY];
            System.arraycopy(objects, 0, tempArray, 0, objects.length);
            objects = tempArray;
        }
        objects[index++] = msg;
    }

    public ELEMENT_TYPE get(int index) {
        return (ELEMENT_TYPE) objects[index];
    }







}
