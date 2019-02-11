import java.util.ArrayList;
import java.util.List;

public class Sync {

    static Object   monitor = new Object();
    static List<String> arrayList = new ArrayList<>();
    public static void main(String[] args) {

        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");

        Thread writer = new Thread(() -> {
            while (true) {
                synchronized (monitor) {
                    for (int i = 5; i < 100; i++) {
                        arrayList.add(String.valueOf(i));
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {

                        }
                    }
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        Thread reader = new Thread(() -> {
            while (true) {
                synchronized (monitor) {
                    for (String s : arrayList) {
                        System.out.println(s);
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Конец\n");
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        writer.start();
        reader.start();
    }
}
