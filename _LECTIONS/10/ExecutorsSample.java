import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ExecutorsSample {
    private ExecutorService service = Executors.newFixedThreadPool(4);


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorsSample sample = new ExecutorsSample();

       /* Future<Integer> submit = sample.service.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(500);
                System.out.println("Решаем задачу");
                return 1;
            }
        });

        System.out.println("задача отправлена");
        Integer integer = null;
        try {
            integer = submit.get(3000, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            System.out.println("задача выполнялась слишком долго");
            sample.service.shutdownNow();
            return;
        }
        System.out.println("задача решена " + integer);*/


        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(new Supplier() {
            @Override
            public Integer get() {
                return 42;
            }
        }, sample.service);

       /* future.thenAccept(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("задача решена completable future  " + integer);
            }
        });*/


        future.thenApply(new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer + 100;
            }
        }).thenApply(new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*2;
            }
        }).thenAccept(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });


    }
}
