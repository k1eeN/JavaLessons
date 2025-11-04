package lesson_40_multithreading_2;

public class CashMachine {
    private int cash;
    private final Object monitor = new Object();

    public void acceptingCash(String name, int money) {
        synchronized (monitor) {
            System.out.println(name + " подошел к банкомату");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (money <= this.cash) {
                this.cash -= money;
                System.out.println(name + " вывел " + money + " рублей.");
                System.out.println("В банкомате осталось " + this.cash + " рублей.");
            } else {
                System.out.println("В банкомате недостаточно денег для " + name);
            }
        }
    }

    public CashMachine(int cash) {
        this.cash = cash;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }
}
