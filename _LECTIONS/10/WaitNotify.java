public class WaitNotify {


    public static int array[] = new int[2];

    public static Object waitObj = new Object();


    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    thread2();
                } catch (InterruptedException e) {
                    //
                }
            }
        });
        t.start();

        synchronized (waitObj) {
            waitObj.wait();
            while ( array[0] != 0) {
                waitObj.wait();
            }
            System.out.println("Готово первое число " + array[0]);

            waitObj.wait();
            System.out.println("Готово второе число число " + array[1]);
        }
    }




    public static void thread2() throws InterruptedException {
        synchronized (waitObj) {
            Thread.sleep(1000);
            array[0] = 42;
            waitObj.notify();
        }

        synchronized (waitObj) {
            Thread.sleep(2000);
            array[1] = 100500;
            waitObj.notify();
        }


    }
}
