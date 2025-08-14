package Day4;

class Rent{
	double rent;
	int electricity;
	int gas;
	public void rent_supply(double rent, int gas) {
		this.rent= rent;
		this.gas=gas;
		System.out.println("the gas bill : "+ gas);
		System.out.println("the rent bill : "+ rent);
		System.out.println("the gas bill and rent bill : "+ gas+" "+ rent);

	}
	public void rent_supply(int electricity, int gas) {
		this.electricity=electricity;
		this.gas=gas;
		System.out.println("the gas bill : "+ gas);
		System.out.println("the electricity bill : "+ electricity);
		System.out.println("the gas bill and electricity bill : "+ gas+" "+ electricity);

	}
}
public class Property {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rent r1=new Rent();
		r1.rent_supply(200, 300);

	}

}
