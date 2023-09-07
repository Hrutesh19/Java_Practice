public class ReverseString {

    public static void main(String[] args) {
        String stringName = "Hrutesh";
        String reversedString = reverseString(stringName);
        System.out.println(reversedString);
    }

    public static String reverseString(String str) {
        StringBuilder reversedString = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString.append(str.charAt(i));
        }
        return reversedString.toString();
    }
}
