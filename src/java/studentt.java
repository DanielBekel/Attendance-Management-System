
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;



@ManagedBean
@SessionScoped
public class studentt {
 public studentt(){
    
}
  private String fname;
  private String lname;
  private static int idnu;
  private String departement;
  private String totalstudent;
  private String teachname;
  private String teachid;
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
        PreparedStatement stmt=connection.prepareStatement("Insert into STUDEN(FNAME,LNAME,IDNU,DEPARTEMENT,TOTALSTUDENT,TEACHNAME,TEACHID,DATEOF,STATUS,BATCH) values (?,?,?,?,?,?,?,?,?,?)");     
        stmt.setString(1,fname);  
        stmt.setString(2,lname);  
        stmt.setInt(3,idnu);  
        stmt.setString(4,departement); 
         stmt.setString(5,totalstudent);  
        stmt.setString(6,teachname);  
        stmt.setString(7,teachid);  
        stmt.setString(8,dateof); 
          stmt.setString(9,status);
          stmt.setString(10,batch);
        stmt.executeUpdate();  
            System.err.println("success");
        }
        catch (SQLException e) {
        }
    }
          public static String delete(int idnu){
        System.out.println("deleted " + idnu);
        try {
             connectingDB db=new connectingDB();
             Connection connection = db.connMethod();
            PreparedStatement stmt=connection.prepareStatement("delete from STUDEN where IDNU = " + idnu);  
            stmt.executeUpdate();  
            connection.close();
        } catch(Exception sqlException){
            sqlException.printStackTrace();
        }
        System.out.println("deleted");
        return "/student.xhtml?faces-redirect=true";
    }
          public static String update(studentt updateStudentObj) {
        try {
            Map<String,Object> sessionMapObj = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
            connectingDB db=new connectingDB();
             Connection connection = db.connMethod();
            PreparedStatement stmt=connection.prepareStatement("update STUDEN set fname=?, lname=?, idnu=?,departement=?, totalstudent=?,teachname=?,teachid=?,dateof=?,status=? where idnu=?");    
            stmt.setString(1,updateStudentObj.getFname());  
            stmt.setString(2,updateStudentObj.getLname());  
            stmt.setInt(3,updateStudentObj.getIdnu());  
            stmt.setString(4,updateStudentObj.getDepartement());  
            stmt.setString(5,updateStudentObj.getTotalstudent());  
            stmt.setString(6,updateStudentObj.getTeachname());  
            stmt.setString(7,updateStudentObj.getTeachid());  
            stmt.setString(8,updateStudentObj.getDateof());  
            stmt.setString(9,updateStudentObj.getStatus());
            stmt.setString(9,updateStudentObj.getBatch());
            stmt.executeUpdate();
            
            sessionMapObj.put("editRecordObj", idnu);
            connection.close(); 
        } catch(Exception sqlException) {
            sqlException.printStackTrace();
        }
        return "/student.xhtml?faces-redirect=true";
    }
          
  
}
