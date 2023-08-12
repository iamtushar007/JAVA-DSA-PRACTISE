public class Palindrome {

    static boolean approach1(String str) {
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());
    }

    static boolean approach2(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(approach1("racecar"));
        System.out.println(approach2("abba"));
    }
}