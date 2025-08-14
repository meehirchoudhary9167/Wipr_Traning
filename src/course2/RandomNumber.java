package course2;

import java.util.Random;
public class RandomNumber {
	
	public static void main(String[] args) {
		long randomdigit=RandomNumberGenerator();
		System.out.println("10 Digit Random Number: "+ randomdigit);
		
	}
	 public static long RandomNumberGenerator() {
		 Random random = new Random(); 
		 long min =10000000L;
		 long max =99999999L;
		 
		 long randomdigit = min+((long)(random.nextDouble() * (max-min+1)));
		 return randomdigit;
			 
		 
	 }

}
