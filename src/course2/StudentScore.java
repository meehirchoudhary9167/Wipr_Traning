package course2;
import java.util.HashMap;  // For creating the HashMap
import java.util.Map;      // General map interface
import java.util.Scanner;  // For taking input from user

public class StudentScore {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Map<String ,Integer> studentScore= new HashMap<>();
		
		System.out.println("Enter number of Students");
		int count= sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<count;i++) {
			System.out.println("Enter Student name: ");
			String name=sc.nextLine();
			
			System.out.println("enter score :"+name+": ");
			int score =sc.nextInt();
			sc.nextLine();
			studentScore.put(name, score);
			
			System.out.print("Enter name of student to get the score: ");
	        String searchName = sc.nextLine();

	        if (studentScore.containsKey(searchName)) {
	            System.out.println("Score of " + searchName + " is: " + studentScore.get(searchName));
	        } else {
	            System.out.println("Student not found.");
	        }

	        sc.close();

		}
	}

}
