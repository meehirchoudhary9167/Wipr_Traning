package Day3;

public class SaleItem {

	private int quantity;
	private double price;
	private String ProductName;
	
	
	public  SaleItem(String ProductName,double price , int quantity) {
		this.price=price;
		this.quantity=quantity;
		this.ProductName=ProductName;
	}
	public double getTotalPrice() {
		return price*quantity;
		
	}
		 public void displayItem() {
		       System.out.println(ProductName + "\t" + price + "\t" + quantity + "\t" + getTotalPrice());
		   }
		
	}
	
