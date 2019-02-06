public class StoPyatsot {
    /**
     * Задача 3. Есть массов чисел (см. предыдущее задание)
     * 1. Найдите в нем самое больше число.
     * 2. Если в массиве встретилось число 100500 - игнорировать его при определении самого большого. Т.е.
     * в массиве [1, 2, 3, 100500, 42] - самое большое - 42.
     * @param args
     */
    public static void main (String[] args){
        int[] array = new int[args.length];
        int maxNum = Integer.MIN_VALUE;
        for(int i = 0; i<array.length;i++){
            array[i] = Integer.valueOf(args[i]);
            if(array[i] > maxNum&&array[i] != 100500){
                maxNum = array[i];
            }
        }
        System.out.println("The biggest number is " + maxNum);

    }
}
