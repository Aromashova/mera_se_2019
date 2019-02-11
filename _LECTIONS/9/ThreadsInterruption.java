public class ThreadsInterruption {

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                System.currentTimeMillis();
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    Thread.interrupted();
                }
                System.out.println("Я проснулся!");
            }
        });
        t.start();

        t.interrupt();
        t.join();
        System.out.println("Конец!");
    }
}
