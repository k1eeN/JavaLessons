package lesson_46_lambda;

public class Director {
    public String force(Worker worker, int count) {
        return worker.work(count);
    }
}
