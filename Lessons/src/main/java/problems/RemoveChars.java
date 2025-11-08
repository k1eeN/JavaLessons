package problems;

public class RemoveChars {
    public static String remove(String str) {
        if (str.length() < 2) {
            return "";
        }
        String result = "";
        for (int i = 1; i < str.length() - 1; i++) {
            result += str.charAt(i);
        }
        return result;
    }
}
