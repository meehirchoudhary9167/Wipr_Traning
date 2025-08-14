package Day12_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest {
    public static void main(String[] args) {
        try {
            // 1. Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // 2. Connect to MySQL Database
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/JDBC",  // URL
                    "root",                                   // username
                    "meehir123");                         // password
            
            System.out.println("Connected to Database!");

            // 3. Create Statement
            Statement stmt = con.createStatement();

            // 4. Execute Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM student2");

            // 5. Process Result
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " + 
                                   rs.getString("name") + " | " + 
                                   rs.getInt("number"));
            }

            // 6. Close Connection
            con.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

