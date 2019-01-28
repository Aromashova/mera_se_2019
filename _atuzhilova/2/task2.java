/**
 * This program prints sum of elements in the array
 */
public class task2 {
    public static void main (String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        boolean isGreater1000 = false;
        for(int number: array) {
            sum += number;

            if(!isGreater1000 && number > 1000) {
                System.out.println("Массив массивный!");
                isGreater1000 = true;
            }
        }
        System.out.println("Сумма элементов массива: " + sum);
    }
}