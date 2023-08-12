public class PallindromeSubstring {

    static boolean isPallindrome(String str) {
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());
    }

    public static void main(String[] args) {
        String str = "abccbc";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String temp = str.substring(i, j);
                if (isPallindrome(temp)) {
                    System.out.print(temp + " ");
                }
            }
            System.out.println();
        }
    }
}
