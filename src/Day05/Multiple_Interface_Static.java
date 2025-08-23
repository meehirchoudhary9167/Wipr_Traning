package Day5;

interface Program_A{
	static void show() {
		System.out.println("Now program A is running in background");
	}
}
interface Program_B{
	static void show() {
		System.out.println("Now program B is running in background");
	}
}
class Program_Class implements Program_A,Program_B{
	
	public void display() {
		System.out.println("This is program background ");
	}
}
public class Multiple_Interface_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program_Class p1 =new Program_Class();
		p1.display();
		Program_A.show();
		Program_B.show();

	}

}
