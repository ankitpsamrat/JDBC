import java.sql.*;

public class FirstJDBC {
    public static void main(String[] args) {
        try {
            // load the driver

            Class.forName("com.mysql.jdbc.Driver");

            // create a connection

            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "admin";
            Connection con = DriverManager.getConnection(url, username, password);

            if (con.isClosed()) {
                System.out.println("Connection closed..");
            } else {
                System.out.println("Connection created..");
            }

        } catch (Exception e) {

        }
    }

}