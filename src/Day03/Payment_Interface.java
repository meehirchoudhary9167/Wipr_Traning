package Day3;

interface EcomarcesPayment
{
	void makePayment() ;
	
}
abstract class PaymentSystems implements EcomarcesPayment
{
	double amount ;
	
	PaymentSystems(double amount)
	{
		this.amount = amount ;
	}
	
	void showSuccessMessage()
	{
		System.out.println("Payment is SuccessFull "+amount);
	}
}
class DebitCardPayment extends PaymentSystems
{
	DebitCardPayment(double amount)
	{
		super(amount) ;
	}
	
	public void makePayment()
	{
		System.out.println("Debit Card Payment is Done...");
		showSuccessMessage();
	}
}
class NetBankingPayment extends PaymentSystems
{
	 NetBankingPayment(double amount)
	 {
		super(amount) ;
	}
	
	 public void makePayment()
	{
		System.out.println("Net Banking Payment is Done...");
		showSuccessMessage();
	}
}
public class Payment_Interface
{
	public static void main(String[] args)
	{
		PaymentSystems ep = new DebitCardPayment(34000) ;
		ep.makePayment();
		
		
		System.out.println();
		
		PaymentSystems ep2 = new NetBankingPayment(55000) ;
		ep2.makePayment();		
		
		
	}
}
