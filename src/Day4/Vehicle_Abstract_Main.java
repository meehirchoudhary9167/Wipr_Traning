package Day4;

abstract class Vehicle {
    abstract void speed();
    abstract void brandName();
}

class Vehicle_One extends Vehicle {
    void speed() {
        System.out.println("This is the Speed of this Vehicle one");
    }

    void brandName() {
        System.out.println("This is the Brand Name of this Vehicle one");
    }
}

class Vehicle_Two extends Vehicle {
    void speed() {
        System.out.println("This is the Speed of this Vehicle two");
    }

    void brandName() {
        System.out.println("This is the Brand Name of this Vehicle two");
    }
}

public class Vehicle_Abstract_Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle_One();
        v1.speed();
        v1.brandName();

        Vehicle v2 = new Vehicle_Two();
        v2.speed();
        v2.brandName();
    }
}

