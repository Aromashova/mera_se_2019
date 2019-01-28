/**
 * This program determines the maximum value in the array
 */
public class task3 {
    public static void main (String[] args) {
        int[] array = {30, -3, 0, 100, 78, -25};
        int max = array[0];
        for(int number: array) {
            if (number == 100500){
                System.out.println("Ignore 100500");
                continue;
            }
            if (number > max) {
                max = number;
                //System.out.println("Maximum value was changed to " + max);
            }
        }
        System.out.println("Maximum is " + max);
    }
}