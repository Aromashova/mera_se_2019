public class ThreadsExample {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Начинаю считать");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 5; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.setDaemon(true);
        thread.start();
        //Thread.sleep(1000L);




        System.out.println("Наверное, я считаю параллельно");
    }
}
