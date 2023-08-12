//Printing always top to down and from left to right
//no. of starrs to print==no. in array index

public class PrintBarChart {
    public static void main(String[] args) {
        int max = 0;
        int arr[] = { 2, 1, 7, 9, 0 };
        // find out the max
        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }
        int min = 1;
        for (int i = max; i >= min; i--) {
            for (int j = 0; j < arr.length; j++) {
                if (i <= arr[j]) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();// Move to the next line
        }
    }
}
