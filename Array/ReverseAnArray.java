public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        // Two Pointer Approach

        int low = 0;
        int high = arr.length - 1;
        for (int i = 0; i < (arr.length) / 2; i++) {
            int temp = 0;
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
