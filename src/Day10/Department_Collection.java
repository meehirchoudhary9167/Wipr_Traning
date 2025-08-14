package Day10;

import java.util.ArrayList;
import java.util.Collections;

public class Department_Collection {
    static class department {
        private String name;
        private double sale;
        private double expense;

        public department(String name, double sale, double expense) {
            this.name = name;
            this.sale = sale;
            this.expense = expense;
        }

        public double profit() {
            return sale - expense;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        ArrayList<department> dept = new ArrayList<department>();
        dept.add(new department("Sale", 2000, 1500));
        dept.add(new department("HR", 3000, 2000));
        dept.add(new department("Marketing", 2500, 1000));

        // Print profit before sorting
        for (department d : dept) {
            System.out.println(d.getName() + " profit " + d.profit());
        }

        // Sort based on profit
        dept.sort((d1, d2) -> Double.compare(d1.profit(), d2.profit()));

        System.out.println("Sorting is done successfully");

        // Print profit after sorting
        for (department d : dept) {
            System.out.println(d.getName() + " profit " + d.profit());
        }
    }
}
