package lesson_25_multithreading;

public class HomeWork25 {

    static boolean win = false;

    public static void main(String[] args) {
        int random = (int) (Math.random() * 1000000000);
        System.out.println(random);
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                int count = 1;
                try {
                    while (!win) {
                        System.out.println(count);
                        count++;
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                }
            }
        });
        Thread player = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!win) {
                    int winNumber = (int) (Math.random() * 1000000000);
                    if (winNumber == random) {
                        win = true;
                        System.out.println(winNumber);
                    }
                }
            }
        });
        timer.start();
        player.start();
    }
}
