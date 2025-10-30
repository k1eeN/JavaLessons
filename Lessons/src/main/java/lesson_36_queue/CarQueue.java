package lesson_36_queue;

import lesson_33_iterable.Car;
import lesson_33_iterable.CarCollection;

public interface CarQueue extends CarCollection {
    boolean add(Car car);

    Car peek();

    Car poll();
}
