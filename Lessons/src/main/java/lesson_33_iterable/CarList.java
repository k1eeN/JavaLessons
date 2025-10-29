package lesson_33_iterable;

public interface CarList extends CarCollection {
    Car get(int index);

    boolean add(Car car);

    boolean add(Car car, int index);

    boolean remove(Car car);

    boolean removeAt(int index);

    boolean contains(Car car);

    int size();

    void clear();
}
