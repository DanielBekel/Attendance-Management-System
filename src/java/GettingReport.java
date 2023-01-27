

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;






@ManagedBean


public class GettingReport {
   
      public List <ReportRetrieve> rep;
    public List <ReportRetrieve> getdisplayReport() throws ClassNotFoundException{
    rep = new ArrayList<>();
    
    
      
    try{
        
          connectingDB dbcon = new connectingDB();
            Connection con = dbcon.connMethod();
             ResultSet rs = con.createStatement().executeQuery("select * from REPORT  ");
                 while (rs.next()) {
             
          
                String ttname = rs.getString("TEACHERNAME");                             
               String  batch = rs.getString("SELECTBATCH");
                   String depa = rs.getString("DEPARTEMENT");
                  String totaP = rs.getString("TOTALPRESENT");
                String tota = rs.getString("TOTALABSENT");
                 
                rep.add(new ReportRetrieve(ttname,batch,depa,totaP,tota));
            } 
             
    }catch( SQLException e)
    {
    
    
    }
    
    return rep;
    }
    }

