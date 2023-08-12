public class NaivePatternMatching {

    static int naivePatternMatching(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        for (int i = 0; i < n - m; i++) {
            int j = 0;
            while (j < m && text.charAt(i + j) == pattern.charAt(j)) {
                j++;
            }
            if (j == m) {
                System.out.println("Found at index");
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String text = "abbaccbc";
        String pattern = "bacc";
        int res = naivePatternMatching(text, pattern);
        System.out.println(res);
    }
}
