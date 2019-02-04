package lection7;

public class Utils {

    public static Object getMaxObj (Object one, Object another) {
        if (one instanceof Comparable && another instanceof Comparable) {
            return ((Comparable) one).compareTo(another) > 0 ? one : another;
        }
        throw new RuntimeException("Not comparable");

    }

    public static <COMPAR> COMPAR getMax(COMPAR one, COMPAR another) {
        if (one instanceof Comparable && another instanceof Comparable) {
            return ((Comparable) one).compareTo(another) > 0 ? one : another;
        }
        throw new RuntimeException("Not comparable");
    }

    public static void main(String[] args) {
        /*Object maxObj = getMaxObj("Привет", 12);


        Integer i1 = 42;
        Integer i2 = 0;
        Object maxObj = getMaxObj(i1, i2);
        System.out.println(maxObj);*/


        String max = getMax("Привет", "Str");
        Integer max1 = getMax(42, 0);
        System.out.println(max);
        System.out.println(max1);

    }
}
