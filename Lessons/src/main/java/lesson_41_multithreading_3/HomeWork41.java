package lesson_41_multithreading_3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HomeWork41 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        CountDownLatch countDownLatch = new CountDownLatch(3);
        long before = System.currentTimeMillis();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                long sum = 0;
                for (int i = 0; i < 1_000_000; i++) {
                    if (i % 2 == 0) {
                        sum += i;
                    }
                }
                System.out.println("Task1: " + sum);
                countDownLatch.countDown();
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                long sum = 0;
                for (int i = 0; i < 1_000_000; i++) {
                    if (i % 7 == 0) {
                        sum += i;
                    }
                }
                System.out.println("Task2: " + sum);
                countDownLatch.countDown();
            }
        });
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                List<Integer> numbers = new ArrayList<>();
                for (int i = 0; i < 1000; i++) {
                    numbers.add((int) (Math.random() * 1000));
                }
                int count = 0;
                for (int i : numbers) {
                    if (i % 2 == 0) {
                        count++;
                    }
                }
                System.out.println("Task3: " + count);
                countDownLatch.countDown();
            }
        });

        executorService.shutdown();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long after = System.currentTimeMillis();
        System.out.println("Время выполнения: " + (after - before));
    }
}
