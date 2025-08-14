package Day5;

interface Class_A {
    void show_A();
}

interface Class_B {
    void show_B();
}

interface Class_C {
    void show_C();
}

class Class_Program implements Class_A, Class_B, Class_C {
    @Override
    public void show_A() {
        System.out.println("This is multiple interface implementation using Class_A");
        
    }
    @Override
    public void show_B() {
        System.out.println("This is multiple interface implementation using Class_B.");
        
    }
    @Override
    public void show_C() {
        System.out.println("This is multiple interface implementation using Class_C.");
        
    }
}

public class Multiple_Interface_Void {
    public static void main(String[] args) {
        Class_Program c1 = new Class_Program(); 
        c1.show_A();
        c1.show_B();
        c1.show_C();
        
    }
}

