public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[args.length];
        for(int i=0; i<args.length; i++) {
            array[i] = Integer.valueOf(args[i]);
        }
        handleArray(array);
    }

    public static void handleArray(int[] array) {
        int sum = 0;
        for(int i=0; i<array.length; i++) {
            sum = sum +array[i];
        }
        System.out.println("Sum = " + sum);
        for(int i: array) {
            if(i>1000) {
                System.out.println("Massive array");
                break;
            }
        }
    }
}
