


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean
@SessionScoped
public class Register {
   private String teacherName;
   private String teacherid;
   private String date;
  private String pass;
  private String stat;
public Register(){
       
   }
    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }
  
   

   public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
        public void techregister() throws ClassNotFoundException {
        try {
            connectingDB db=new connectingDB();
             Connection connection = db.connMethod();
        PreparedStatement stmt=connection.prepareStatement("Insert into TEACHER(TEACHERNAME,TEACHERID,DATEE,PASS,STAT) values (?,?,?,?,?)");     
        stmt.setString(1,teacherName);  
        stmt.setString(2,teacherid);  
        stmt.setString(3,date);  
        stmt.setString(4,pass); 
        stmt.setString(5,stat); 
        stmt.executeUpdate();  
            System.err.println("success");
        }
        catch (SQLException e) {
        }
    }

    
    
   }
   

