package lesson_11_parameterized;

public class Rect {
    int length;
    int width;

    void first (int length, int width) {
        this.length = length;
        this.width = width;
    }
    String second () {
        return "P= " + 2 * (length + width);
    }
    String third () {
        return "S= " + length * width;
    }
}
