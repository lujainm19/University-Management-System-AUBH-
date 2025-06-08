package universitymanagementsystem;
import java.sql.*;

public class Conn {

    //connection string reference variable
    Connection c;
    Statement s;

    Conn() {
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //to mention info of databases being conneceted to DriverManager class has function getConnection “method used to connect project:database://where mysql is working/name of database”, “MySQL username”, “MySQL password";
            c = DriverManager.getConnection("jdbc:mysql:///universitymanagementsystem", "root", "2006");
            s = c.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
