package Day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Java_Collection_2 {
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<Integer>(Arrays.asList(100, 500, 200, 400, 300));
        obj.add(600);
        obj.add(800);

        // Print unsorted list
        System.out.println(obj + " unsorted");

        // Sort the list in ascending order
        Collections.sort(obj);
        System.out.println(obj + " sorted");

        // Binary search for 300
        int b = Collections.binarySearch(obj, 300);
        System.out.println("Index of 300 is " + b + " from sorted list because we are using collections");

        // Reverse the list
        Collections.reverse(obj);
        System.out.println(obj + " reverse order");
    }
}
