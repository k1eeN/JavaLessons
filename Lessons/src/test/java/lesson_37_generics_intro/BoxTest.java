package lesson_37_generics_intro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoxTest {

    @Test
    public void testBox() {
        Box<String, Integer, Float> box1 = new Box<>("String", 2, 3.5f);
        Box<String, Integer, Float> box2 = new Box<>("String", 5, 6.5f);
        float result = box1.getValue() + box1.getAdd() + box2.getValue() + box2.getAdd();
        assertEquals(17, result, 0.001);
    }

}