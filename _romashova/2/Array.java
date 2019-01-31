public class Array {
    public static void main(String[] args) {
        int[] arr = {1, 1001, 2, 3, 4, 5, 6, 7, 8, 9, 1001, 100500};
        int sum = 0;
        int a = 0;
        boolean bool = true;

        for (int i = 0; i < arr.length; i++) {
            if (bool  && arr[i] > 1000){
                System.out.println("Массив - массивный!");
                bool = false;
            }
            sum += arr[i];

            if (arr[i] > a && arr[i] != 100500) {
                a = arr[i];
            }
        }
        System.out.println(sum);
        System.out.println(a);
    }

}
