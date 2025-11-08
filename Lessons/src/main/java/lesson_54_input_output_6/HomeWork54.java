package lesson_54_input_output_6;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class HomeWork54 {
    public static void main(String[] args) {
        File file = new File("catlist.usr");
//        List<Cat> catList = new ArrayList<>();
//        catList.add(new Cat("Sirius", "Sfinks", 5));
//        catList.add(new Cat("Arsusha", "Nevskii", 4));
//        catList.add(new Cat("Vasya", "Metis", 8));
//        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
//            objectOutputStream.writeObject(catList);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            List<Cat> saveCatList = (List<Cat>) objectInputStream.readObject();
            for (Cat cat : saveCatList) {
                System.out.println(cat.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
