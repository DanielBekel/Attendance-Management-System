
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean
@SessionScoped
public class studentt {
  
    
  private String fname;
  private String lname;
  private String idnu;
  private String departement;
  private String totalstudent;
  private String teachname;
  private String teachid;
  private String dateof;
 private String status;
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
 
 
      
   
  
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getIdnu() {
        return idnu;
    }

    public void setIdnu(String idnu) {
        this.idnu = idnu;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getTotalstudent() {
        return totalstudent;
    }

    public void setTotalstudent(String totalstudent) {
        this.totalstudent = totalstudent;
    }

    public String getTeachname() {
        return teachname;
    }

    public void setTeachname(String teachname) {
        this.teachname = teachname;
    }

    public String getTeachid() {
        return teachid;
    }

    public void setTeachid(String teachid) {
        this.teachid = teachid;
    }

    public String getDateof() {
        return dateof;
    }

    public void setDateof(String dateof) {
        this.dateof = dateof;
    }
          public void sturegister() throws ClassNotFoundException {
        try {
            connectingDB db=new connectingDB();
             Connection connection = db.connMethod();
        PreparedStatement stmt=connection.prepareStatement("Insert into STUDEN(FNAME,LNAME,IDNU,DEPARTEMENT,TOTALSTUDENT,TEACHNAME,TEACHID,DATEOF,STATUS) values (?,?,?,?,?,?,?,?,?)");     
        stmt.setString(1,fname);  
        stmt.setString(2,lname);  
        stmt.setString(3,idnu);  
        stmt.setString(4,departement); 
         stmt.setString(5,totalstudent);  
        stmt.setString(6,teachname);  
        stmt.setString(7,teachid);  
        stmt.setString(8,dateof); 
          stmt.setString(9,status);
        stmt.executeUpdate();  
            System.err.println("success");
        }
        catch (SQLException e) {
        }
    }
  
}
