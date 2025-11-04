// JDBCInsert.java
import java.sql.*;

public class JDBCInsert {
    public static void main(String[] args) {
               String url = "jdbc:mysql://localhost:3306/bca_db?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "";

        String insertSql = "INSERT INTO students (name, rollno) VALUES (?, ?)";

        try {
                        Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection conn = DriverManager.getConnection(url, user, password);
                 PreparedStatement pstmt = conn.prepareStatement(insertSql)) {

                System.out.println("Connection Successful");

                // Hard-coded record insertion
                pstmt.setString(1, "Swati Joshi"); // your name
                pstmt.setInt(2, 12345); // your roll number
                int rows = pstmt.executeUpdate();

                if (rows > 0) {
                    System.out.println("Record Inserted");
                } else {
                    System.out.println("Insert failed");
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found. Add connector JAR to classpath.");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
