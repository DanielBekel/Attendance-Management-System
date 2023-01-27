
import javax.faces.bean.ManagedBean;







@ManagedBean

public class Retrieve {
  

    public String getFName() {
        return fname;
    }

    public String getLName() {
        return lname;
    }

    public int getIdnu() {
        return idnu;
    }

    public String getDepartement() {
        return departement;
    }

    public String getTotalStudent() {
        return totalstudent;
    }

    public String getTeachName() {
        return teachname;
    }
  public int getTeacherid() {
        return teacherid;
    }

    public String getDateOf() {
        return dateof;
    }



    public String getStatus() {
        return status;
    }

    public String getBatch() {
        return batch;}

    private final  String fname;
    private final  String lname;
    private final  int idnu;
    private final  String departement;
    private final  String totalstudent;
    private final  String teachname;
    private final  int teacherid;
    private final  String dateof;
    private final  String status;
     private final  String batch;
    
    public Retrieve(String fname, String lname, int idnu, String departement, String totalstudent, String teachname, int teacherid, String dateof,String status,String batch)
    {
    this.fname =fname;
    this.lname=lname;
     this.idnu=idnu;
    this.departement=departement;
    this.totalstudent=totalstudent;
    this.teachname=teachname;
   
    this.teacherid=teacherid;
    this.dateof=dateof;
    this.status=status;
    this.batch=batch;
    }
} 

