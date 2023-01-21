
import javax.faces.bean.ManagedBean;







@ManagedBean
public class Retrieve {
  



    public String getName() {
        return fname;
    }

    public String getAge() {
        return lname;
    }

    public String getId() {
        return idnu;
    }

    public String getGender() {
        return departement;
    }

    public String getProff() {
        return totalstudent;
    }

    public String getPhonee() {
        return teachname;
    }
  public String getTeachid() {
        return teachid;
    }

    public String getAddresss() {
        return dateof;
    }



    public String getDate() {
        return status;
    }


    private  String fname;
    private  String lname;
    private  String idnu;
    private  String departement;
    private  String totalstudent;
    private  String teachname;
    private  String teachid;
    private  String dateof;
    private  String status;
    
    
    public Retrieve(String fname, String lname, String idnu, String departement, String totalstudent, String teachname, String teachid, String dateof,String status)
    {
    this.fname =fname;
    this.lname=lname;
     this.idnu=idnu;
    this.departement=departement;
    this.totalstudent=totalstudent;
    this.teachname=teachname;
   
    this.teachid=teachid;
    this.dateof=dateof;
    this.status=status;
    }
} 

