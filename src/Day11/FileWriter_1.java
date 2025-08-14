package Day11;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String cont ="meehir";
		FileWriter fw = new FileWriter("C:\\Users\\Meehir\\Downloads\\java.txt");
		fw.write("this is java class\n"+ cont +"\n");
		fw.write("this is wipro preskilling");
		fw.close();
		System.out.println("this is filewriter process");
	}

}
