package lesson_50_input_output_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class HomeWork50 {
    public static void main(String[] args) {
        File directory = new File("HomeWork50");
        directory.mkdir();
        File file = new File(directory, "listname.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (InputStream inputStream = new FileInputStream(file)) {
            int a = inputStream.read();
            while (a != -1) {
                System.out.print((char) a);
                a = inputStream.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
