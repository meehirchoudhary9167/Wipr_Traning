package Day6;

public class Exception_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] a= {1,2,3,4,5};
			System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index error");
		}
		finally {
			System.out.println("this running array program ");
		}

	}

}
