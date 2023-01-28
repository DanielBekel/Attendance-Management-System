


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;



@ManagedBean
@SessionScoped
public class UpdateStudentClass {
  private String fname;
  private String lname;
  private static int idnu;
  private String departement;
  private String totalstudent;
  private String teachname;
  private int teacherid;
  private String dateof;
 private String status;
private String batch;

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
   
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

    public int getIdnu() {
        return idnu;
    }

    public void setIdnu(int idnu) {
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

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid=teacherid;
    }

    public String getDateof() {
        return dateof;
    }

    public void setDateof(String dateof) {
        this.dateof = dateof;
    } 
    

public void updateStu(){
    try {
         
         
            connectingDB dbcon = new connectingDB();
            Connection con = dbcon.connMethod();
            String updatee= "update STUDEN set FNAME='"+fname+"',LNAME='"+lname+"',DEPARTEMENT='"+departement+"',"
                    + "TOTALSTUDENT='"+totalstudent+"',TEACHNAME='"+teachname+"',TEACHERID='"+teacherid+"',"
                    + "DATEOF='"+dateof+"',STATUS='"+status+"',BATCH='"+batch+"'  where IDNU='"+idnu+"'";
          Statement que=null;
        que = con.createStatement();
        que.executeQuery(updatee);
            
          
       
            System.err.println("success");
    } catch (ClassNotFoundException | SQLException e) {
        
    }
    
}
}
