package Day2;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1};
        Arrays.sort(arr);

        System.out.print("Sorted Array: ");
        for (int val : arr) System.out.print(val + " ");
    }
}
