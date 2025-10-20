package lesson_8_string_and_switch;

public class Lesson8String {
    public static void main(String[] args) {
        String[] strings = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };
        String result = "";
        for (int i = 0; i < strings.length; i++) {
            result += strings[i];
            if (i == strings.length - 1) {
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.println(result);
    }
}
