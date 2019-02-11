public class ParallelRun {
    static Object lock = new Object();
    static class Counter extends Thread {
        String name;

        public Counter(String name) {
            this.name = name;
        }

        @Override
        public synchronized void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(name + " " + i);

                }
        }
        /*@Override
        public void run() {
               synchronized (lock) {
                   for (int i = 0; i < 5; i++) {
                       System.out.println(name + " " + i);

                   }
               }
        }*/
    }

    public static void main(String[] args) {
        Counter k1 = new Counter("Один");
        Counter k2 = new Counter("Два");
        Counter k3 = new Counter("Три");

        k1.start();
        k2.start();
        k3.start();
    }
}
