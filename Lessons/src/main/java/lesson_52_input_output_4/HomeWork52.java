package lesson_52_input_output_4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class HomeWork52 {
    public static void main(String[] args) {
        File directory = new File("HomeWork50");
        File file = new File(directory, "listname.txt");
        try (OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a name or \"Stop\" to exit: ");
            String next = scanner.nextLine();
            while (!next.equals("Stop")) {
                outputStream.write(next.getBytes());
                outputStream.write("\n".getBytes());
                next = scanner.nextLine();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try (InputStream inputStream = new BufferedInputStream(new FileInputStream(file))) {
            byte[] array = new byte[128];
            int count = inputStream.read(array);
            StringBuilder result = new StringBuilder();
            while (count > 0) {
                result.append(new String(array, 0, count));
                count = inputStream.read(array);
            }
            System.out.println(result.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
