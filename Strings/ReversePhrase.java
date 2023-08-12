public class ReversePhrase {
    public static String reverseString(String s) {
        // Finding the index of the whitespaces
        int x = s.indexOf(" ");

        // Base condition
        if (x == -1)
            return s;

        // Recursive call
        return reverseString(s.substring(x + 1)) + " " + s.substring(0, x);
    }

    public static void main(String[] args) {
        String str = "I am good";
        String rev = reverseString(str);
        System.out.println("Reversed sentence: " + rev);
    }
}
