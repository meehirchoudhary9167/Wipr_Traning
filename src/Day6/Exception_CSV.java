package Day6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception_CSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Meehir\\Downloads\\Book1.csv"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("CSV Line: " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("CSV file not found.");
        } catch (IOException e) {
            System.out.println("Error reading CSV file.");
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                System.out.println("Error closing CSV reader.");
            }
        }
    }
}