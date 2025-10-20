package lesson_11_parameterized;

public class Rect {
    int length;
    int width;

    void getDimens (int length, int width) {
        this.length = length;
        this.width = width;
    }
    String getPerimeter () {
        return "P= " + 2 * (length + width);
    }
    String getSquare () {
        return "S= " + length * width;
    }
}
