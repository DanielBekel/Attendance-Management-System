

  import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@Dependent
@ManagedBean

@SessionScoped
public class getlist  {

    public List<studentt> getUserList() {
        List<studentt> list = new ArrayList<>();
        try {
        
       connectingDB dbcon = new connectingDB();
            Connection con = dbcon.connMethod();
            ResultSet rs = con.createStatement().executeQuery("select * from STUDEN");
            while (rs.next()) {
                studentt admin = new studentt();
                admin.setFname(rs.getString("FNAME"));
                admin.setLname(rs.getString("LNAME"));
                admin.setIdnu(rs.getString("IDNU"));
                admin.setDepartement(rs.getString("DEPARTEMENT"));
                admin.setTotalstudent(rs.getString("TOTALSTUDENT"));
                admin.setTeachname(rs.getString("TEACHERNAME"));
                admin.setTeachid(rs.getString("TEACHID"));
                 admin.setDateof(rs.getString("DATEOF"));
                 admin.setStatus(rs.getString("STATUS"));
                //course[1]=rs.getString("COURSE");
                //usr.setCourse(course);
                list.add(admin);
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
        return list;
    }

}  

