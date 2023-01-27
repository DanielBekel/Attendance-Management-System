

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;







@ManagedBean


public class GettingReport {
   
      public List <ReportRetrieve> rep;
    public List <ReportRetrieve> getdisplayReport() throws ClassNotFoundException{
    rep = new ArrayList<>();
    
    
      
    try{
        
          connectingDB dbconn = new connectingDB();
            Connection con = dbconn.connMethod();
             ResultSet resul = con.createStatement().executeQuery("select * from REPORT ");
                 while (resul.next()) {
             
          
                String tteaname = resul.getString("TEACHERNAME");                             
               String  batch = resul.getString("SELECTBATCH");
                   String depa = resul.getString("DEPARTEMENT");
                  String totaP = resul.getString("TOTALPRESENT");
                String tota = resul.getString("TOTALABSENT");
                 
                rep.add(new ReportRetrieve(tteaname,batch,depa,totaP,tota));
            } 
             
    }catch( SQLException e)
    {
    
    
    }
    
    return rep;
    }
    }

