package lesson_45_multithreading_7;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class HomeWork45 {

    private static final long TIME = (long) (Math.random() * 6000 + 1000);
    private static final int CARS_IN_TUNNEL = 3;
    private static final int CARS = 10;

    private static final CountDownLatch countDownLatch = new CountDownLatch(CARS);
    private static final CountDownLatch countDownLatch2 = new CountDownLatch(CARS);
    private static final ExecutorService executorService = Executors.newCachedThreadPool();
    private static final Semaphore semaphore = new Semaphore(CARS_IN_TUNNEL);
    private static final Map<Integer, Long> score = new ConcurrentHashMap<>();

    private static int indexWinner = -1;
    private static final Object monitor = new Object();

    public static void main(String[] args) {
        for (int i = 0; i < CARS; i++) {
            final int index = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(index + " Начал подготовку");
                    try {
                        Thread.sleep(TIME);
                        System.out.println(index + " Закончил подготовку");
                        countDownLatch.countDown();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        countDownLatch.await();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    long before = System.currentTimeMillis();
                    System.out.println(index + " Начал первую дорогу");
                    try {
                        Thread.sleep(TIME);
                        System.out.println(index + " Закончил первую дорогу");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    try {
                        semaphore.acquire();
                        System.out.println(index + " Начал тунель");
                        Thread.sleep(TIME);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } finally {
                        semaphore.release();
                        System.out.println(index + " Закончил тунель");
                    }
                    try {
                        System.out.println(index + " Начал вторую дорогу");
                        Thread.sleep(TIME);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(index + " Финишировал");
                    synchronized (monitor) {
                        if (indexWinner == -1) {
                            indexWinner = index;
                        }
                    }
                    long after = System.currentTimeMillis();
                    score.put(index, after - before);
                    countDownLatch2.countDown();
                }
            });
        }
        try {
            countDownLatch2.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int key : score.keySet()) {
            System.out.println(key + " " + score.get(key));
        }
        System.out.println("Победитель: " + indexWinner + " время: " + score.get(indexWinner));
        executorService.shutdown();
    }
}
