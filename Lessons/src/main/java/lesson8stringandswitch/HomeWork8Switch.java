package lesson8stringandswitch;

public class HomeWork8Switch {
    public static void main(String[] args) {
        String month = "Januaryy";
        switch (month) {
            case "December":
            case "January":
            case "February":
                System.out.println("Winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("Summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("Autumn");
                break;
            default:
                System.out.println("There is no month");
                break;
        }
    }
}