import java.util.HashSet;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int nums[] = { 1, 1, 2 };
        HashSet<Integer> set = new HashSet<>();
        for (int element : nums) {
            set.add(element);
        }
        System.out.println(set);
    }
}
