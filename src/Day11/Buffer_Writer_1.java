package Day11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer_Writer_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedWriter br=new BufferedWriter(new FileWriter("C:\\Users\\Meehir\\Downloads\\java.txt",true));
		br.write("hello world everyone ");
		br.newLine();
		br.close();
		System.out.println("successfully");

	}

}
