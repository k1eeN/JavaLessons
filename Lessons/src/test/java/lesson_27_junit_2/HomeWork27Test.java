package lesson_27_junit_2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HomeWork27Test {

    private HomeWork27 homeWork27;

    @Before
    public void setUp() {
        homeWork27 = new HomeWork27();
    }

    @Test
    public void add() {
        int expected = 10;
        int result = homeWork27.add(5, 5);
        assertEquals(expected, result);
    }

    @Test
    public void multiplication() {
        double expected2 = 10;
        double result2 = homeWork27.multiplication(5, 2);
        assertEquals(expected2, result2, 0.001);
    }

    @Test
    public void testMultiplication() {
        double expected2 = 10;
        double result2 = homeWork27.multiplication("5", "2");
        assertEquals(expected2, result2, 0.001);
    }

    @Test(expected = Exception.class)
    public void testDivision() {
        homeWork27.multiplication("sfghsfgh", "5");
    }

    @Test
    public void division() {
        double expected3 = 2;
        double result3 = homeWork27.division(10, 5);
        assertEquals(expected3, result3, 0.001);
    }

    @Test
    public void square() {
        double expected4 = 4;
        double result4 = homeWork27.square(2);
        assertEquals(expected4, result4, 0.001);
    }
}