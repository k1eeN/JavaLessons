package lesson_17_shells;

public class HomeWork17 {
    public static void main(String[] args) {
        String homeWork = "Это Иван, ему 34 года, его рост 166.3 см. Должность - программист";
        String name = homeWork.substring(4,8);
        String post = homeWork.substring(54,65);
        String ageData = homeWork.substring(14,16);
        String heightData = homeWork.substring(32,37);
        int age = Integer.parseInt(ageData);
        double height = Double.parseDouble(heightData);
        Man man = new Man(name,post,age,height);
        System.out.println(man.getName() + " " + man.getPost() + " " + man.getAge() + " года " + man.getHeight() + " см.");

    }
}
