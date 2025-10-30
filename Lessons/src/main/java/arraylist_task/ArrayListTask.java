package arraylist_task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListTask {
    public static class Student {
        String name;
        int marks;

        public Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mila", 90));
        students.add(new Student("Ivan", 60));
        students.add(new Student("Petar", 78));
        students.add(new Student("Ana", 82));
        students.add(new Student("Sara", 95));
        students.add(new Student("Nikola", 88));
        students.add(new Student("Marija", 67));
        students.add(new Student("Stefan", 76));
        students.add(new Student("Jelena", 99));
        students.add(new Student("Marko", 65));

        List<Student> filtered = new ArrayList<>();
        for (Student student : students) {
            if (student.marks > 75) {
                filtered.add(student);
            }
        }

        filtered.sort(new Comparator<Student>() {
            @Override
            public int compare(Student t1, Student t2) {
                return Integer.compare(t2.marks, t1.marks);
            }
        });

        for (Student student : filtered) {
            System.out.println(student.name + ", " + student.marks);
        }
    }
}
