package Day2;

public class SumArray {
    public static void main(String[] args) {
        int[] arr = {4, 8, 6, 2};
        int sum = 0;

        for (int val : arr) sum += val;

        System.out.println("Sum of array = " + sum);
    }
}
