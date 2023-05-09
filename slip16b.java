import java.sql.*;

public class SlipB {
    // Database credentials
    static final String DB_URL = "jdbc:postgresql://localhost:5432/your_database";
    static final String USER = "your_username";
    static final String PASS = "your_password";

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("org.postgresql.Driver");

            // Open a connection to the database
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Prepare the SQL statement to insert teacher details
            String insertQuery = "INSERT INTO Teacher (TNo, TName, Subject) VALUES (?, ?, ?)";
            stmt = conn.prepareStatement(insertQuery);

            // Insert 5 teacher records into the table
            insertTeacher(stmt, 1, "John Smith", "JAVA");
            insertTeacher(stmt, 2, "Jane Doe", "C++");
            insertTeacher(stmt, 3, "Michael Johnson", "JAVA");
            insertTeacher(stmt, 4, "Emily Wilson", "Python");
            insertTeacher(stmt, 5, "Robert Thompson", "JAVA");

            // Display the details of teachers teaching "JAVA" subject
            displayJavaTeachers(conn);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the resources
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    // Helper method to insert teacher records
    private static void insertTeacher(PreparedStatement stmt, int tNo, String tName, String subject) throws SQLException {
        stmt.setInt(1, tNo);
        stmt.setString(2, tName);
        stmt.setString(3, subject);
        stmt.executeUpdate();
    }

    // Helper method to display details of teachers teaching "JAVA" subject
    private static void displayJavaTeachers(Connection conn) throws SQLException {
        String selectQuery = "SELECT TNo, TName FROM Teacher WHERE Subject = ?";
        PreparedStatement stmt = conn.prepareStatement(selectQuery);
        stmt.setString(1, "JAVA");
        ResultSet rs = stmt.executeQuery();

        System.out.println("Teachers teaching 'JAVA' subject:");
        while (rs.next()) {
            int tNo = rs.getInt("TNo");
            String tName = rs.getString("TName");
            System.out.println("TNo: " + tNo + ", TName: " + tName);
        }

        rs.close();
        stmt.close();
    }
}