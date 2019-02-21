import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambdas {

    public static void main(String[] args) {
        Lambdas object = new Lambdas();
        List<String> strings = Arrays.asList("a", "b", "c", "a", "e");
        Comparator<String> stringComparator = (one, another) -> object.compareTo(one, another);
        Collections.sort(strings, stringComparator);
        System.out.println(strings);



    }

    public  int compareTo(String one,String another) {
        return another.compareTo(one);
    }
}
