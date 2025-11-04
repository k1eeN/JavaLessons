package lesson_42_multithreading_4;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

public class Lesson42 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3, new ThreadFactory() {
            @Override
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                thread.setDaemon(true);
                return thread;
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        System.out.print(".");
                        Thread.sleep(300);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Future<String> futureName = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(5000);
                return "John";
            }
        });
        Future<Integer> futureAge = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(4000);
                return 20;
            }
        });
        try {
            String name = futureName.get();
            int age = futureAge.get();
            System.out.println("\nИмя: " + name + " Возраст: " + age + " лет.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
