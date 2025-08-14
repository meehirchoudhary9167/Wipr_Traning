package Day13;

import java.sql.*;

public class JDBC_1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/JDBC";
        String username = "root";
        String pwd = "meehir123";

        try {
            // 1. Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect to Database
            Connection con = DriverManager.getConnection(url, username, pwd);
            System.out.println("✅ Connected to MySQL Database!");

            // 3. Create Table (if not exists)
            Statement st = con.createStatement();
            String stu = "CREATE TABLE IF NOT EXISTS student(" +
                         "id INT AUTO_INCREMENT PRIMARY KEY," +
                         "name VARCHAR(255)," +
                         "age INT," +
                         "standard INT)";
            st.executeUpdate(stu);
            System.out.println("✅ Table ready!");

            // 4. Insert Data using PreparedStatement
            String val = "INSERT INTO student(name, age, standard) VALUES(?,?,?)";
            PreparedStatement ps = con.prepareStatement(val);
            ps.setString(1, "Meehir");
            ps.setInt(2, 22);
            ps.setInt(3, 12);
            ps.executeUpdate();
            
            ps.setString(1, "Aryan");
            ps.setInt(2, 22);
            ps.setInt(3, 12);
            ps.executeUpdate();

            ps.setString(1, "Rohit");
            ps.setInt(2, 20);
            ps.setInt(3, 10);


            
            int rows = ps.executeUpdate();
            System.out.println("✅ Inserted rows: " + rows);
            
            //update
            String updateQuery="update student set age=? where name=?";
            PreparedStatement ps1=con.prepareStatement(updateQuery);
            ps1.setInt(1, 21);
            ps1.setString(2, "Rohit");
            int updateRow= ps1.executeUpdate();
            System.out.println("updated succesfully"+updateRow);
            

            // 5. Fetch Data
            String Query = "SELECT * FROM student ";
            ResultSet rs = st.executeQuery(Query);
            System.out.println("\nID | Name   | Age | Standard");
            System.out.println("-------------------------------");
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);
                int standard = rs.getInt(4);

                System.out.printf("%d  | %s  | %d  | %d\n", id, name, age, standard);
            }

            // 6. Close Connection
            rs.close();
            ps.close();
            st.close();
            con.close();
            System.out.println("✅ Connection Closed.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

