package Day4;
import java.util.*;

class Prop {
    String name;
    double price;

    public Prop(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " - ₹" + price + " Lakhs";
    }
}


public class RealEstateLambda {
    public static void main(String[] args) {
        List<Prop> properties = Arrays.asList(
            new Prop("2BHK in Mumbai", 120),
            new Prop("1BHK in Pune", 45),
            new Prop("Villa in Goa", 200)
        );

        System.out.println("Expensive Properties (Price > ₹100L):");

        // Using lambda expression to filter
        properties.stream()
                  .filter(p -> p.price > 100)
                  .forEach(p -> System.out.println(p));
    }
}
