import java.sql.*;
import java.io.*;

public class ImageSave {
    public static void main(String[] args) {
        try {
            // load driver

            Class.forName("com.mysql.cj.jdbc.Driver");

            // create connection

            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "admin";
            Connection con = DriverManager.getConnection(url, username, password);

            // create query

            String q = "insert into image(pic) values(?)";

            // get object

            PreparedStatement pstmt = con.prepareStatement(q);

            // insert image

            FileInputStream files = new FileInputStream("my pic.jpg");
            pstmt.setBinaryStream(1, files, files.available());

            // execute query

            pstmt.executeUpdate();

            System.out.println("Inserted..");
            con.close();

        } catch (Exception e) {
            System.out.print("Error !!");
        }
    }
}
