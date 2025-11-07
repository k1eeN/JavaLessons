package lesson_49_input_output;

import java.io.File;
import java.io.IOException;

public class HomeWork49 {
    public static void main(String[] args) {
        File directory = new File("Folder1/Folder2/Folder3");
        File file1 = new File("Folder1/Folder2/Folder3/file1.txt");
        File aile2 = new File("Folder1/Folder2/Folder3/aile2.txt");
        File file3 = new File("Folder1/Folder2/Folder3/file3.txt");

        try {
            directory.mkdirs();
            file1.createNewFile();
            aile2.createNewFile();
            file3.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File[] files = directory.listFiles((file, s) -> s.contains("a"));
        for (File f : files) {
            System.out.println(f.getAbsolutePath());
        }
    }
}
