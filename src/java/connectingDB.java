

import java.sql.Connection;
import java.sql.SQLException;

import java.sql.SQLException;

import java.sql.DriverManager;


       
public class connectingDB {
    




// JDBC driver name and database URL

    static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";

    //  Database credentials
    static final String USER = "ATTEND";
    static final String PASS = "2628";
    Connection con = null;

    public Connection connMethod() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
       // System.out.println("Connecting to a selected database...");
        con = DriverManager.getConnection(DB_URL, USER, PASS);
        if (con != null) {
           System.out.println("Connected to db");
        } else {
           System.out.println("not connected to DB");
       }
        return con;
        
    }
   
    public static void main(String []args) throws ClassNotFoundException, SQLException{
       
    connectingDB obj = new connectingDB();
   
    System.out.println(obj.connMethod());
    }
}
      
