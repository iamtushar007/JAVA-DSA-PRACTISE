public class Sort0and1 {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, };
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        for (int i = count; i < arr.length; i++) {
            arr[i] = 1;
        }

        for (int i : arr) {
            System.out.println(i);
        }

    }
}
