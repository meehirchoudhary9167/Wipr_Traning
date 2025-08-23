package Day4;
import java.util.Scanner;

interface RentCal {
    void rent(double r);
}

class Apartment_one implements RentCal {
    public void rent(double r) {
        double t = 10 * r / 100;
        double r2 = t + r;
        System.out.println("Tax for Apartment (10% of " + r + "): " + t);
        System.out.println("Final Apartment Rent: " + r2);
    }
}

class Home_one implements RentCal {
    public void rent(double r) {
        double t = 10 * r / 100;
        double r2 = t + r;
        System.out.println("Tax for Home (10% of " + r + "): " + t);
        System.out.println("Final Home Rent: " + r2);
    }
}

public class RealEstateSystem_Interface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your category (Apartment/House): ");
        String category = sc.next();

        System.out.print("Enter base rent amount: ");
        double rent = sc.nextDouble();

        RentCal rc;

        if (category.equalsIgnoreCase("Apartment")) {
            rc = new Apartment_one();
        } else if (category.equalsIgnoreCase("House")) {
            rc = new Home_one();
        } else {
            System.out.println("Invalid category entered.");
            sc.close();
            return;
        }

        rc.rent(rent);
        sc.close();
    }
}

