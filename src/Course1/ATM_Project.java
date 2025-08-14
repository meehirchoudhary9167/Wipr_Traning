package Course1;
import java.util.Scanner;
public class ATM_Project {
    private double balance;
    private Scanner scanner;
    //constructor
    public ATM_Project() {
    	balance =1000.0;//initial balance $1000;
    	scanner =new Scanner(System.in);
    }
    public void displayMenu() {
    	System.out.println("ATM MENU");
    	System.out.println("1 . Check Balance");
    	System.out.println("2 . Deposit Money");
    	System.out.println("3 . withdraw");
    	System.out.println("4. Exit");

    }
    
    public void checkBalance() {
    	System.out.println("your balance : "+ balance);
    }
    
   public void deposit() {
    	System.out.println("enter your amount");
    	double amount =scanner.nextDouble();
    	if(amount>0) {
    		balance+= amount;
    		System.out.println("$"+ amount +"has been deposited");
    		
    	}
    	else {
    		System.out.println("Invalid amount , Please check again");
    	}
    }
  
   public void withdraw() {
	   System.out.println("enter the amount to withdraw");
	    double amount =scanner.nextDouble();
	    if (amount >0 && amount<=balance) 
	    {balance -= amount;
	    System.out.println("$"+ amount + "has been withdraw");
	    	
	    }
	    else if (amount >balance) {
	    	System.out.println("insufficient balance");
	    }
	    else {
	    	System.out.println("invalid amount , please enter valid amount ");
	    }
  	
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM_Project atm =new ATM_Project();
		while(true)
		{
			atm.displayMenu();
			System.out.println("enter your choice");
			int choice= atm.scanner.nextInt();
			switch (choice) {
			case 1:
				atm.checkBalance();
				break;
			
			case 2:
				atm.deposit();
				break;
				
			case 3:
				atm.withdraw();
				break;
				
			case 4: 
				System.out.println("Thankyou for using ATM , Good Bye");
				break;
			default :
				System.out.println("invalid choice, please select valid choice");			}
			
		}
	}

}
