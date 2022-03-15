import java.sql.*;

public class InsertJDBC {

    public static void main(String[] args) {
        try {
            // load the driver

            Class.forName("com.mysql.cj.jdbc.Driver");

            // create a connection

            String url = "jdbc:mysql://localhost:3306/youtube";
            String username = "root";
            String password = "admin";
            Connection con = DriverManager.getConnection(url, username, password);

            // create a query

            String q = "create table table1(tId int(20) primary key auto_increment, tName varchar(200) not null, tCity varchar(200))";

            // create a statement

            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("table created..");
            con.close();

        } catch (Exception e) {

        }
    }
}
