import java.time.LocalDate;

public class Java8New {

    interface ImprovedComparable {

        int compareTo(LocalDate o);

        default boolean greater(LocalDate o) {
            return compareTo(o) > 0;
        };

        default boolean lesser(LocalDate o) {
            return compareTo(o) < 0;
        }

        default boolean isEqual(LocalDate o) {
            return compareTo(o) == 0;
        }
    }


    public static class MyDate implements ImprovedComparable {
        LocalDate date;

        public MyDate(LocalDate date) {
            this.date = date;
        }

        @Override
        public int compareTo(LocalDate o) {
            return date.compareTo(o);
        }

        @Override
        public String toString() {
            return "MyDate{" + "date=" + date + '}';
        }
    }

    public static void main(String[] args) {

        MyDate d = new MyDate(LocalDate.now());

        LocalDate o = LocalDate.now().minusDays(30);
        if (d.greater(o)) {
            System.out.println(d + " больше чем " + o);
        }

    }
}
