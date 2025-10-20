package lesson_12_constructors;

public class Worker {
    String name;
    String post;
    int salary;

    Worker (String name, String post, int salary) {
        this.name = name;
        this.post = post;
        this.salary = salary;
    }
    String getInfo (int i) {
        return "Сотрудник " + name + ", должность " + "\"" + post + "\"" + ", за последние " + i + " месяцев получил " + salary * i + " рубей.";
    }
}
