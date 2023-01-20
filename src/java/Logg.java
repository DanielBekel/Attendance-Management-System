import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;




@ManagedBean
@SessionScoped


public class Logg {
 private String userName;
 private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
 public String validateMethod() throws SQLException, ClassNotFoundException {
        boolean status = valid(userName, password);
        if (status) {
              connectingDB dbcon = new connectingDB();
            Connection con = dbcon.connMethod();
            PreparedStatement ps = con.prepareStatement("select ADMINAME from LOGINAUTHO where ADMINAME=?");
            ps.setString(1, userName);   
          
            ResultSet rs = ps.executeQuery();
            rs.next();
            String UserName =rs.getString(1);
            if ("mark".equals(UserName)) {
                return "AdminPanel";
            } else {
                return "Loginn";
            }
        } else {
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Incorrect Username and Passowrd",
                            "Please enter correct username and Password"));
            return "ManuPage";
        }
    }
 
    public static boolean valid(String adminame, String password) {
        boolean check = false;
        try {

            connectingDB dbcon = new connectingDB();
            Connection con = dbcon.connMethod();
            PreparedStatement ps = con.prepareStatement("select * from LOGINAUTHO where ADMINAME=? and PASSWORD=?");
            ps.setString(1, adminame);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            check = rs.next();

        } catch (Exception e) {
            System.out.println(e);
        }
        return check;
    }
    
}
 

