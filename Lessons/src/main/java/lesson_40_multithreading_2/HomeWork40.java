package lesson_40_multithreading_2;

public class HomeWork40 {
    public static void main(String[] args) {
        CashMachine cashMachine = new CashMachine(1000);
        Thread man1 = new Thread(new Runnable() {
            @Override
            public void run() {
                cashMachine.acceptingCash("Марк", 300);

            }
        });
        Thread man2 = new Thread(new Runnable() {
            @Override
            public void run() {
                cashMachine.acceptingCash("Леся", 500);
            }
        });
        Thread man3 = new Thread(new Runnable() {
            @Override
            public void run() {
                cashMachine.acceptingCash("Сириус", 400);
            }
        });

        man1.start();
        man2.start();
        man3.start();
    }
}
