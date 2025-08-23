package Day1;

public class NonstaticMethod {

	  public void sayHello() {
	        System.out.println("Hello from non-static method!");
	    }

	    public static void main(String[] args) {
	        NonstaticMethod obj = new NonstaticMethod();
	        obj.sayHello(); // Calling non-static method
	    }
	}