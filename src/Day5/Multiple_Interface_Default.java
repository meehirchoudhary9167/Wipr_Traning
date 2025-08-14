package Day5;

interface Interface_A{
	default void show() {
		System.out.println("This is the current Show_A");
	}
}

interface Interface_B {
	default void show() {
		System.out.println("This is the current Show_B");
	}
}
class MyClass implements Interface_A,Interface_B{
	@Override
public void show() {
		Interface_B.super.show();
		//Interface_A.super.show();

	}
}
public class Multiple_Interface_Default {
	public static void main(String[] args) {
		MyClass c1=new MyClass();
		c1.show();
	}
	

}
