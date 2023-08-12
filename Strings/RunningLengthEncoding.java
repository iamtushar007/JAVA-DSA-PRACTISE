//  I/O   str:aaaabbbccccddd
//  O/P   a4b3c4d3

public class RunningLengthEncoding {

    static void RLE(String str) {
        int n = str.length() - 1;
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n && str.charAt(i) == str.charAt(i + 1)) {
                i++;
                count++;
            }
            System.out.print(str.charAt(i) + "" + count);
        }
        return;
    }

    public static void main(String[] args) {
        String str = "aaaabbbccccddd";
        RLE(str);
    }
}