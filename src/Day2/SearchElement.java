package Day2;

public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int key = 15;
        boolean found = false;

        for (int val : arr) {
            if (val == key) {
                found = true;
                break;
            }
        }

        System.out.println(key + (found ? " found" : " not found") + " in array.");
    }
}
