package lesson_35_hashmap;

import java.util.List;
import java.util.Set;

import lesson_33_iterable.Car;

public interface CarMap {
    void put(CarOwner key, Car value);

    Car get(CarOwner key);

    Set<CarOwner> keySet();

    List<Car> values();

    boolean remove(CarOwner key);

    int size();

    void clear();
}
