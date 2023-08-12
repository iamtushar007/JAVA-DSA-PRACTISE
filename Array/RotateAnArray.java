public class RotateAnArray {

    static void reverse(int arr[], int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int rotations = -3; // can be positive or negative
        int arr[] = { 10, 20, 30, 40, 50 };
        // rotations must be in range
        rotations = rotations % arr.length;
        if (rotations < 0) {
            rotations = arr.length + rotations;
        }
        // reverse the first part of the array(length-rotations-1)
        reverse(arr, 0, (arr.length - rotations - 1));
        // reverse the second part of arrray
        reverse(arr, arr.length - rotations, arr.length - 1);
        // Full reverse
        reverse(arr, 0, arr.length - 1);
        for (int ele : arr) {
            System.out.println(ele);
        }
        System.out.println();
    }
}
