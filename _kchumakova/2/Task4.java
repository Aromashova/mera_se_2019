public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[args.length];
        for(int i=0; i<args.length; i++) {
            array[i] = Integer.valueOf(args[i]);
        }
        findMax(array);
    }

    public static void findMax(int[] array) {
        int max = 0;
        for(int i=0; i<array.length; i++) {
            if(array[i]>=max && (array[i] != 100500)) {
                max=array[i];
            }
        }
        System.out.println(max);
    }
}
