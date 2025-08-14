package Day6;
import java.util.Scanner;
public class Exception_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		try {
			System.out.println("Enter the number for Factorial");
			 int num = sc.nextInt();
			if(num<0) {
				System.out.println("Error: Factorial of negative number is no");
			}
			else {
				long fact =1;
				for(int i=1;i<=num;i++) {
					fact*=i;
				}
				System.out.println("factorial of " + num +" is " + fact);
				
			}
			
		}
		catch(Exception e){
			System.out.println("Invalid innput please enter valide integer");
			
		}
		finally {
			System.out.println("this is ended");
			
		}
		sc.close();
		
		
		

	}

}
