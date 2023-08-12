import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubsequence {
    static List<String> generateSubsequence(String str) {
        ArrayList<String> subSeqList = new ArrayList<>();

        int n = str.length();
        for (int i = 0; i < n; i++) {
            char firstChar = str.charAt(i);
            if (subSeqList.size() == 0) {
                subSeqList.add("");
                subSeqList.add("" + firstChar);
                continue;
            }
            int sublen = subSeqList.size();
            for (int j = 0; j < sublen; j++) {
                String temp = subSeqList.get(j) + firstChar;
                subSeqList.add(temp);
            }
        }
        return subSeqList;
    }

    static String lcs(String str1, String str2) {
        List<String> subseq1list = generateSubsequence(str1);
        List<String> subseq2list = generateSubsequence(str2);

        String ans = "";
        for (String word1 : subseq1list) {
            for (String word2 : subseq2list) {
                if (word1.equals(word2) && word1.length() > ans.length()) {
                    ans = word1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "aebyc";
        System.out.println(lcs(str1, str2));
    }
}
