public class SuffixString {

    static void findsuffixString(String str) {
        int n = str.length();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = str.substring(n - 1 - i);
        }
        for (String ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        String str = "apple";
        findsuffixString(str);
    }
}
