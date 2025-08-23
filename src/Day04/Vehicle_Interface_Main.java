package Day4;

interface Vehicle_drive{
	void speed();
	void brandName();
	
}
 class Vehicle_O implements Vehicle_drive{
	 public void speed() {
		 System.out.println("This is the Speed of this Vehicle one");
	 }
	 public void brandName() {
		 System.out.println("This is brand Name of this Vehicle_one");
	 }
	 
 }
 class Vehicle_T implements Vehicle_drive{
	 public void speed() {
		 System.out.println("This is the Speed of this Vehicle two");
	 }
	 public void brandName() {
		 System.out.println("This is brand Name of this Vehicle_two");
	 }
	 
 }

public class Vehicle_Interface_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle_drive v1= new Vehicle_O();
		v1.speed();
		v1.brandName();
		
		Vehicle_drive v2= new Vehicle_T();
		v2.speed();
		v2.brandName();

	}

}
