package lesson_26_junit_1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HomeWork26Test {

    @Test
    public void add() {
        HomeWork26 homeWork26 = new HomeWork26();
        int expected = 10;
        int result = homeWork26.add(5, 5);
        assertEquals(expected, result);
    }

    @Test
    public void multiplication() {
        HomeWork26 homeWork26 = new HomeWork26();
        double expected2 = 10;
        double result2 = homeWork26.multiplication(5, 2);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    public void division() {
        HomeWork26 homeWork26 = new HomeWork26();
        double expected3 = 2;
        double result3 = homeWork26.division(10, 5);
        assertEquals(expected3, result3, 0.001);
    }

    @Test
    public void square() {
        HomeWork26 homeWork26 = new HomeWork26();
        double expected4 = 4;
        double result4 = homeWork26.square(2);
        assertEquals(expected4, result4, 0.001);
    }
}