public class PreComputationTechnique {
    public static void main(String[] args) {
        // Prefix Sum or Suffix Sum form Pre computational Technique
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        System.out.println("Orginal Array");
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
        System.out.println("Prefix sum array: ");
        for (int el : prefix) {
            System.out.print(el + " ");
        }
        System.out.println();
        System.out.println("Range of 2 5");
        int left = 2;
        int right = 5;
        System.out.println(prefix[right] - prefix[left - 1]);
    }
}
