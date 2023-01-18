
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Reyan
 */
public class Validation {
    public static boolean valid(String name, String pass) {
        boolean check = false;
        try {

            connectingDB dbcon = new connectingDB();
            Connection con = dbcon.connMethod();
            PreparedStatement ps = con.prepareStatement("select * from LOGINAUTHO where ADMINAME=? and PASSWORD=?");
            ps.setString(1, name);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            check = rs.next();

        } catch (Exception e) {
            System.out.println(e);
        }
        return check;
    }
    
}
