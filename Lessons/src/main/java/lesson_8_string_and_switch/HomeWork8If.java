package lesson_8_string_and_switch;

public class HomeWork8If {
    public static void main(String[] args) {
        String month = "August";
        String[] months = {
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
        if (month.equals(months[0]) || month.equals(months[1]) || month.equals(months[11])) {
            System.out.println("Winter");
        } else if (month.equals(months[2]) || month.equals(months[3]) || month.equals(months[4])) {
            System.out.println("Spring");
        } else if (month.equals(months[5]) || month.equals(months[6]) || month.equals(months[7])) {
            System.out.println("Summer");
        } else if (month.equals(months[8]) || month.equals(months[9]) || month.equals(months[10])) {
            System.out.println("Autumn");
        } else {
            System.out.println("There is no month");
        }
    }
}
