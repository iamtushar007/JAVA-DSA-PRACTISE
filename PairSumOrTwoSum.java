import java.util.Arrays;
import java.util.HashMap;

public class PairSumOrTwoSum {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 4 };
        int target = 6;

        // Approach 1 O(n^2)

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 1; j < arr.length - 1; i++) {
        // if (arr[i] + arr[j] == target)
        // System.out.println(i + " " + j);
        // }
        // }

        // Approach 2 O n Log n Sort the array and use the 2 pointer approach

        // Arrays.sort(arr);
        // int low = 0;
        // int high = arr.length - 1;
        // while (low < high) {
        // if ((arr[low] + arr[high]) == target) {
        // System.out.println("Two Sum " + arr[low] + " " + arr[high]);
        // return;
        // }
        // if ((arr[low] + arr[high]) < target) {
        // low++;
        // } else if ((arr[low] + arr[high]) > target) {
        // high--;
        // }
        // }

        // Approach 3 O(N)

        // int max = 0;
        // for (int element : arr) {
        // if (element > max) {
        // max = element;
        // }
        // }
        // int hash[] = new int[max + 1]; // fill 0
        // // all 5 fills with 0
        // for (int i = 0; i < arr.length; i++) {
        // if (hash[arr[i]] == 0) {
        // int index = target - arr[i];
        // hash[index] = arr[i];
        // } else {
        // int secondPair = hash[arr[i]];
        // int firstPair = arr[i];
        // System.out.println("Two Sum " + firstPair + " " + secondPair);
        // return;
        // }
        // }

        // Approach 4 O(N) Using java HashMap

        int max = 0;
        int indexes[] = new int[2];

        HashMap<Integer, Integer> hash = new HashMap<>();

        // all 5 fills with 0
        for (int i = 0; i < arr.length; i++) {
            if (hash.get(arr[i]) == null) {
                int index = target - arr[i];
                hash.put(index, i); // put(key,value)
            } else {
                indexes[0] = hash.get(arr[i]);
                indexes[1] = i;
                System.out.println("Two Pair Index are " + indexes[0] + " " + indexes[1]);
            }
        }

    }
}
