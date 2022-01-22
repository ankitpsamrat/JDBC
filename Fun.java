import java.sql.*;
import java.io.*;

public class Fun {
    public static void main(String[] args) {
        try {
            // load the driver

            Class.forName("com.mysql.jdbc.Driver");

            // create a connection

            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "admin";
            Connection con = DriverManager.getConnection(url, username, password);

            // create query

            String q = "insert into table1(tName,tCity) values(?,?)";

            // get object

            PreparedStatement pstmt = con.prepareStatement(q);

            // set value

            // pstmt.setString(1, "Samrat");
            // pstmt.setString(2, "Varanasi");
            // pstmt.setString(1, "Ankit");
            // pstmt.setString(2, "India");
            // pstmt.setString(1, "Pratap");
            // pstmt.setString(2, "Uttar Pradesh");

            // when user input

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter name : ");
            String name = br.readLine();
            System.out.print("Enter city : ");
            String city = br.readLine();
            pstmt.setString(1, name);
            pstmt.setString(2, city);

            // execute query

            pstmt.executeUpdate();

            System.out.println("Inserted..");
            con.close();

        } catch (Exception e) {

        }
    }
}
