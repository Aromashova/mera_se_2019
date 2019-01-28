/**
 * This program compares two numbers
 */
public class task1 {
    public static void main(String[] args) {
        int first = 163;
        int second = -88;

        if (first > 100 || second > 100) {
            System.out.println("Есть большое число");
        }
        if (second != 0) {
            System.out.println("Результат деления первого на второе: " + ( (float)first / (float)second ) );
        }
        if (first > second ) {
            System.out.println( first + " больше чем " + second);
        }
        if (second % 2 == 0) {
            System.out.println("Число " + second + " чётное");
        }
    }
}