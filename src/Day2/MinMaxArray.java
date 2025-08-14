package Day2;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {23, 5, 87, 12, 3};
        int min = arr[0], max = arr[0];

        for (int val : arr) {
            if (val < min) min = val;
            if (val > max) max = val;
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
