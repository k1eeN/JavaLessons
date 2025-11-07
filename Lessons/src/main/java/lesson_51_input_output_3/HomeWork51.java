package lesson_51_input_output_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

public class HomeWork51 {
    public static void main(String[] args) {
        File directory = new File("HomeWork50");
        File file = new File(directory, "listname.txt");
        try (Reader reader = new InputStreamReader(new FileInputStream(file))) {
            char[] array = new char[128];
            int count = reader.read(array);
            StringBuilder result = new StringBuilder();
            while (count > 0) {
                result.append(new String(array, 0, count));
                count = reader.read(array);
            }
            String[] names = result.toString().split(" ");
            Arrays.stream(names)
                    .filter(name -> name.startsWith("A"))
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
