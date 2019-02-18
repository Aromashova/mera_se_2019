public class Threads {


    static int[] numbers = new int[]{1, 2, 3};
    static Object lock = new Object();
    static volatile Integer volInt = 42;


    public static void main(String[] args) {
        synchronized (lock) {
            int length = numbers.length;
            for (int i = 0; i < length; i++) {
                System.out.println(numbers[i]); // второй поток может сделать numbers = new int[] {0};
            }
        }

        Threads threads = new Threads();

        threads.doSomehting();
    }


    public static void thread2() {
        synchronized (lock) {
            numbers = new int[]{0};
        }
    }

    public synchronized void doSomehting() {
        numbers = new int[] {42};
    }



}
