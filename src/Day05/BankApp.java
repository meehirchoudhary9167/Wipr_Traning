package Day5;

 interface Bank{
	double getBalance();
	void deposit(double amount);
	void withdraw(double amount);

	default void displayAccountType() {
		System.out.println("Account type : Generic Bank Account");
	}
	 default void executeTransaction(String type,double amount) {
		 if (!Bank.isValid(amount)) {
	            System.out.println("Invalid amount: " + amount);
	            return;
	        }
	        switch (type.toUpperCase()) {
	            case "DEPOSIT":
	                deposit(amount);
	                System.out.println("Deposited $" + amount + ". New balance: $" + getBalance());
	                break;
	            case "WITHDRAW":
	                withdraw(amount);
	                System.out.println("Withdrew $" + amount + ". New balance: $" + getBalance());
	                break;
	            default:
	                System.out.println("Unknown transaction type: " + type);
	        }
	    }

	    // Static method
	    static boolean isValid(double amount) {
	        return amount > 0;
	    }
	}
 class SavingsAccount implements Bank {
	    private double balance;

	    public SavingsAccount(double balance) {
	        this.balance = balance;
	    }

	    @Override
	    public double getBalance() {
	        return balance;
	    }

	    @Override
	    public void deposit(double amount) {
	        balance += amount;
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient funds to withdraw $" + amount);
	        }
	    }

	    @Override
	    public void displayAccountType() {
	        System.out.println("Account Type: Savings Account");
	    }
	}
public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bank account = new SavingsAccount(1000);

	        account.displayAccountType();                   // overridden default
	        account.executeTransaction("deposit", 500);     // deposit
	        account.executeTransaction("withdraw", 200);    // withdraw
	        account.executeTransaction("withdraw", -50);    // invalid
	        System.out.println("Final Balance: $" + account.getBalance());

	}

}
