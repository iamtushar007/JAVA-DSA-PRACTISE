public class FirstAndLastIndex {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 40, 40, 40, 50, 60 };
        int search = 40;
        int firstIndex = -1;
        int lastIndex = -1;
        int low = 0;
        int high = arr.length - 1;
        // for first index
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == search) {
                firstIndex = mid;
                // narrow the search
                high = mid - 1;
            } else if (search > arr[mid]) {
                low = mid + 1;
            } else if (search < arr[mid]) {
                high = mid - 1;
            }
        }

        System.out.println("First Index " + firstIndex);

        // For last index
        low = 0;
        high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == search) {
                lastIndex = mid;
                // narrow the search
                low = mid + 1;
            } else if (search > arr[mid]) {
                low = mid + 1;
            } else if (search < arr[mid]) {
                high = mid - 1;
            }
        }
        System.out.println("Last Index " + lastIndex);
        System.out.println("Occurance " + ((lastIndex - firstIndex) + 1));
    }
}
