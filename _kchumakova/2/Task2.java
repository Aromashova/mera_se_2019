public class Task2 {
    public static void main(String[] args) {
        int val1 = Integer.valueOf(args[0]);
        int val2 = Integer.valueOf(args[1]);
        handleIntegers(val1, val2);
    }

    public static void handleIntegers(int val1, int val2) {
        if((val1 > 100) || (val2 >100)) {
            System.out.println("There is big integer");
        }
        if((val2) != 0) {
            double division = (double)val1/val2;
            System.out.println("Division result: " + division);
        }
        if(val1 > val2) {
            System.out.println(String.format("%d is more than %d", val1, val2));
        }
        if(val2%2 == 0) {
            System.out.println(String.format("%d is countable", val2));
        }
    }
}
