package lesson_44_multithreading_6;

public class MFP {

    private final Object printMonitor = new Object();
    private final Object scanMonitor = new Object();

    public void print(int pages) {
        synchronized (printMonitor) {
            if (pages >= 1) {
                int page = 0;
                for (int i = 0; i < pages; i++) {
                    page++;
                    try {
                        Thread.sleep(2000);
                        System.out.println("Отпечатано " + page + " стр.");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    public void scan(int pages) {
        synchronized (scanMonitor) {
            if (pages >= 1) {
                int page = 0;
                for (int i = 0; i < pages; i++) {
                    page++;
                    try {
                        Thread.sleep(2000);
                        System.out.println("Отсканировано " + page + " стр.");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
