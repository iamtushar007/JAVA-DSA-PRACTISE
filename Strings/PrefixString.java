public class PrefixString {

    static void findsuffixString(String str) {
        int n = str.length();
        String arr[] = new String[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = str.substring(0, i + 1);
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
