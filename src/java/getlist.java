



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
@ManagedBean

public class getlist {
      public List <Retrieve> staffList;
    public List <Retrieve> DisplayStu() throws ClassNotFoundException{
    staffList = new ArrayList<>();
    
    
      
    try{
        
          connectingDB dbcon = new connectingDB();
            Connection con = dbcon.connMethod();
             ResultSet rs = con.createStatement().executeQuery("select * from STUDEN");
                 while (rs.next()) {
             
          
                String fname = rs.getString("FNAME");                             
               String  lname = rs.getString("LNAME");
                   String idnuu = rs.getString("IDNU");
                   String  depar = rs.getString("DEPARTEMENT");
                String tots = rs.getString("TOTALSTUDENT");
                 String  teaname = rs.getString("TEACHNAME");
                   String  teaid = rs.getString("TEACHID");
                  String  dates = rs.getString("DATEOF");
              String  sta = rs.getString("STATUS");
                staffList.add(new Retrieve(fname,lname,idnuu,depar,tots,teaname,teaid,dates,sta));
            } 
             
    }catch( SQLException e)
    {
    
    
    }
    
    return staffList;
    }
    }


