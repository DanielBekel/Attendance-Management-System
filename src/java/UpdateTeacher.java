




import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean
@SessionScoped
public class UpdateTeacher {
   private String teacherName;
   private static int teacherid;
   private String date;
  private String pass;
  private String stat;

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

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
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
public void updateTeach(){
    try {
         
         
            connectingDB dbcon = new connectingDB();
            Connection con = dbcon.connMethod();
            String updat= "update TEACHER set TEACHERNAME='"+teacherName+"',TEACHERID='"+teacherid+"',DATEE='"+date+"',"
                 
                    + "PASS='"+pass+"',STAT='"+stat+"' where TEACHERID='"+teacherid+"'";
          Statement quee=null;
        quee = con.createStatement();
        quee.executeQuery(updat);
            
          
       
            System.err.println("success");
    } catch (ClassNotFoundException | SQLException e) {
        
    }
    
}
    
}
