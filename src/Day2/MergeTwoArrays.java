package Day2;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] merged = new int[a.length + b.length];

        int i = 0;
        for (int val : a) merged[i++] = val;
        for (int val : b) merged[i++] = val;

        System.out.print("Merged Array: ");
        for (int val : merged) System.out.print(val + " ");
    }
}
