

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
@ManagedBean

public class TeacherGet {
   
      public List <TeacherRetrieve> teachList;
    public List <TeacherRetrieve> getdisplayTeach() throws ClassNotFoundException{
    teachList = new ArrayList<>();
    
    
      
    try{
        
          connectingDB dbcon = new connectingDB();
            Connection con = dbcon.connMethod();
             ResultSet rs = con.createStatement().executeQuery("select * from TEACHER  ");
                 while (rs.next()) {
             
          
                String tename = rs.getString("TEACHERNAME");                             
              int teacherid = rs.getInt("TEACHERID");
                   String date = rs.getString("DATEE");
                   String  pass = rs.getString("PASS");
                String stat = rs.getString("STAT");
               
                teachList.add(new TeacherRetrieve(tename,teacherid,date,pass,stat));
            } 
             
    }catch( SQLException e)
    {
    
    
    }
    
    return teachList;
    }
    }




