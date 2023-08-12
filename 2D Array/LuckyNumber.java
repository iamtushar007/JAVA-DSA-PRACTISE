import java.util.ArrayList;
import java.util.List;

class luckyNumber {

    public static void main(String[] args) {
        int matrix[][] = { { 1, 10, 4, 2 }, { 9, 3, 8, 7 }, { 15, 16, 17, 12 } };
        System.out.println(luckyNumbers(matrix));
    }

    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> minValues = new ArrayList<>();
        // Min value in a Row
        int minRow = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                minRow = Math.min(minRow, matrix[i][j]);
            }
            minValues.add(minRow);
            minRow = Integer.MAX_VALUE;
        }
        // Max Value in a Row
        List<Integer> maxValues = new ArrayList<>();

        int maxCol = Integer.MIN_VALUE;
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                maxCol = Math.max(maxCol, matrix[j][i]);
            }
            maxValues.add(maxCol);
            maxCol = Integer.MIN_VALUE;
        }
        // Compare Min in Row and Max in Col,so Store in new List
        List<Integer> result = new ArrayList<>();
        for (int minElement : minValues) {
            if (maxValues.contains(minElement)) {
                result.add(minElement);
            }
        }
        return result;
    }
}