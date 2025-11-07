package problems;

import java.util.Arrays;

public class Inversion {
    public static int[] invert(int[] array) {
        if (array.length == 0) {
            return array;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    array[i] *= -1;
                } else if (array[i] > 0) {
                    array[i] *= -1;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(invert(new int[]{1, 2, 3, 4, 5, 0})));
        System.out.println(Arrays.toString(invert(new int[]{1, -2, 3, -4, 5})));
        System.out.println(Arrays.toString(invert(new int[]{})));
    }
}
