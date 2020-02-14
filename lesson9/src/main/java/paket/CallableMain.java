package paket;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMain {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(1); //колько потоков запустится
        Future<String> f1;
        Future<String> f2;
        Future<String> f3;

        System.out.println("Go");

        f1 = ex.submit(new CallableThread()); //ловля результатов
        f2 = ex.submit(new CallableThread());
        f3 = ex.submit(new CallableThread());

        try {
            System.out.println(f1.get()); //принять результаты потока
            System.out.println(f2.get());
            System.out.println(f3.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        ex.shutdown();
        System.out.println("End");
    }
}
