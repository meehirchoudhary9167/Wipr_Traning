package Day12_JDBC;

import java.sql.*;

public class JdbcCreateTables {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/JDBC";  // Your DB name
        String username = "root";
        String pwd = "meehir123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully.");
        } catch (Exception e) {
            System.err.println("Driver not found");
        }

        try (Connection con = DriverManager.getConnection(url, username, pwd);
             Statement st = con.createStatement()) {

            // 1. Create Screen Table
            String screenTable = """
                CREATE TABLE IF NOT EXISTS Screen (
                    screen_id INT AUTO_INCREMENT PRIMARY KEY,
                    name VARCHAR(50) NOT NULL,
                    class_type VARCHAR(10) NOT NULL,
                    capacity INT NOT NULL
                )
            """;
            st.executeUpdate(screenTable);
            System.out.println("Screen table created.");

            // Insert sample data into Screen
            String screenInsert = "INSERT INTO Screen(name, class_type, capacity) VALUES (?, ?, ?)";
            PreparedStatement psScreen = con.prepareStatement(screenInsert);
            psScreen.setString(1, "IMAX");
            psScreen.setString(2, "Premium");
            psScreen.setInt(3, 150);
            psScreen.executeUpdate();
            System.out.println("1 row inserted into Screen table.");

            // 2. Create Seat Table (linked to Screen)
            String seatTable = """
                CREATE TABLE IF NOT EXISTS Seat (
                    seat_id INT AUTO_INCREMENT PRIMARY KEY,
                    screen_id INT,
                    seat_number VARCHAR(10) NOT NULL,
                    FOREIGN KEY (screen_id) REFERENCES Screen(screen_id)
                )
            """;
            st.executeUpdate(seatTable);
            System.out.println("Seat table created.");

            // Insert sample data into Seat
            String seatInsert = "INSERT INTO Seat(screen_id, seat_number) VALUES (?, ?)";
            PreparedStatement psSeat = con.prepareStatement(seatInsert);
            psSeat.setInt(1, 1); // Assumes Screen ID 1 exists
            psSeat.setString(2, "A1");
            psSeat.executeUpdate();
            System.out.println("1 row inserted into Seat table.");

            // 3. Create Movie Table
            String movieTable = """
                CREATE TABLE IF NOT EXISTS Movie (
                    movie_id INT AUTO_INCREMENT PRIMARY KEY,
                    title VARCHAR(255) NOT NULL,
                    genre VARCHAR(50) NOT NULL,
                    rating DECIMAL(3,1) NOT NULL,
                    status VARCHAR(20) NOT NULL,
                    poster_image_url VARCHAR(255)
                )
            """;
            st.executeUpdate(movieTable);
            System.out.println("Movie table created.");

            // Insert sample data into Movie
            String movieInsert = """
                INSERT INTO Movie(title, genre, rating, status, poster_image_url)
                VALUES (?, ?, ?, ?, ?)
            """;
            PreparedStatement psMovie = con.prepareStatement(movieInsert);
            psMovie.setString(1, "Avengers");
            psMovie.setString(2, "Action");
            psMovie.setBigDecimal(3, new java.math.BigDecimal("8.5"));
            psMovie.setString(4, "Now Showing");
            psMovie.setString(5, "https://example.com/poster.jpg");
            psMovie.executeUpdate();
            System.out.println("1 row inserted into Movie table.");

            // 4. Create Show Table (interconnects Screen & Movie)
            String showTable = """
                CREATE TABLE IF NOT EXISTS ShowTable (
                    show_id INT AUTO_INCREMENT PRIMARY KEY,
                    screen_id INT,
                    movie_id INT,
                    show_datetime DATETIME NOT NULL,
                    FOREIGN KEY (screen_id) REFERENCES Screen(screen_id),
                    FOREIGN KEY (movie_id) REFERENCES Movie(movie_id)
                )
            """;
            st.executeUpdate(showTable);
            System.out.println("Show table created.");

            // Insert sample data into ShowTable
            String showInsert = "INSERT INTO ShowTable(screen_id, movie_id, show_datetime) VALUES (?, ?, ?)";
            PreparedStatement psShow = con.prepareStatement(showInsert);
            psShow.setInt(1, 1);  // Screen ID
            psShow.setInt(2, 1);  // Movie ID
            psShow.setTimestamp(3, java.sql.Timestamp.valueOf("2025-08-02 18:30:00"));
            psShow.executeUpdate();
            System.out.println("1 row inserted into Show table.");
            
            String query = "SELECT * FROM Screen";
            try (ResultSet rs = st.executeQuery(query)) {
                while (rs.next()) {
                    int id = rs.getInt("screen_id");
                    String name = rs.getString("name");
                    String classType = rs.getString("class_type");
                    int capacity = rs.getInt("capacity");

                    System.out.println("Screen ID = " + id + 
                                       ", Name = " + name + 
                                       ", Class = " + classType + 
                                       ", Capacity = " + capacity);
                }
            }


        } catch (SQLException e) {
            System.out.println("Database operation failed!");
            e.printStackTrace();
        }
    }
}
