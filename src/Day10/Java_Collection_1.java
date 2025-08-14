package Day10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// This program is about adding courses
public class Java_Collection_1 {

    public static void main(String[] args) {
        // ArrayList example
        ArrayList<String> course = new ArrayList<String>();
        course.add("English");
        course.add("History");
        course.add("Math");
        course.add("Science");

        System.out.println("ArrayList elements:");
        for (String c : course) {
            System.out.println(c);
        }

        // HashSet example
        Set<Integer> course2 = new HashSet<Integer>();
        course2.add(1);
        course2.add(2);
        course2.add(3);
        course2.add(4);

        System.out.println("\nHashSet elements:");
        for (int c2 : course2) {
            System.out.println(c2);
        }

        // HashMap example
        Map<String, Integer> courses = new HashMap<String, Integer>();
        courses.put("English", 11);
        courses.put("History", 12);
        courses.put("Math", 13);
        courses.put("Science", 14);

        System.out.println("\nHashMap elements:");
        for (String key : courses.keySet()) {
            System.out.println(key + " -> " + courses.get(key));
        }
    }
}
