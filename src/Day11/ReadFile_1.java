package Day11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new FileReader("C:\\Users\\Meehir\\Downloads\\java.txt"));
        String line;
        while((line=br.readLine())!= null) {
        System.out.println(line);}
        br.close();
        System.out.println("this is bufferedreader process ");
        
        
	}

}
