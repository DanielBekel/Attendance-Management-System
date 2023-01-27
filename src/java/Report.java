
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;






@ManagedBean
public class Report {
    
    private String teacherName;
    private String selectBatch;
    private String departement;
    private int totalPresent;
    private int totalAbsent;
   
public Report(){
    
}    

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSelectBatch() {
        return selectBatch;
    }

    public void setSelectBatch(String selectBatch) {
        this.selectBatch = selectBatch;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public int getTotalPresent() {
        return totalPresent;
    }

    public void setTotalPresent(int totalPresent) {
        this.totalPresent = totalPresent;
    }

    public int getTotalAbsent() {
        return totalAbsent;
    }

    public void setTotalAbsent(int totalAbsent) {
        this.totalAbsent = totalAbsent;
    }
    
         public void reporter() throws ClassNotFoundException {
        try {
            connectingDB db=new connectingDB();
             Connection connection = db.connMethod();
        PreparedStatement stmt=connection.prepareStatement("Insert into REPORT(TEACHERNAME,SELECTBATCH,DEPARTEMENT,TOATALPRESENT,TOTALABSENT) values (?,?,?,?,?)");     
        stmt.setString(1,teacherName);  
        stmt.setString(2,selectBatch);  
        stmt.setString(3,departement);  
        stmt.setInt(4,totalPresent); 
         stmt.setInt(5,totalAbsent);  
     
        stmt.executeUpdate();  
            System.err.println("success");
        }
        catch (SQLException e) {
        }
    }
    
}
