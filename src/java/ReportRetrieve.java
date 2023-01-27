




import javax.faces.bean.ManagedBean;
@ManagedBean

public class ReportRetrieve {
    


  

    public String getTeacherName() {
        return teacherName;
    }

    public String getSelectBatch() {
        return selectBatch;
    }

    public String getDepartement() {
        return departement;
    }

    public String getTotalPresent() {
        return totalPresent;
    }

    public String getTotalAbsent() {
        return totalAbsent;
    }

 private final String teacherName;
    private final String selectBatch;
    private final String departement;
    private final String totalPresent;
    private final String totalAbsent;
    
    public ReportRetrieve(String teacherName, String selectBatch, String departement, String totalPresent, String totalAbsent)
    {
    this.teacherName =teacherName;
    this.selectBatch=selectBatch;
     this.departement=departement;
    this.totalPresent=totalPresent;
    this.totalAbsent=totalAbsent;
 
    }
} 


