public class StarToAdjacentCharacters {

    static String AdjacentStar(String str) {
        String ans = "";
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                ans = str.charAt(i) + "*" + str.charAt(i + 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String str = "aabbcc";
        System.out.println(AdjacentStar(str));
    }
}
