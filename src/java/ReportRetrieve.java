




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

    public int getTotalPresent() {
        return totalPresent;
    }

    public int gettotalAbsent() {
        return totalAbsent;
    }

 private final String teacherName;
    private final String selectBatch;
    private final String departement;
    private final int totalPresent;
    private final int totalAbsent;
    
    public ReportRetrieve(String teacherName, String selectBatch, String departement, int totalPresent, int totalAbsent)
    {
    this.teacherName =teacherName;
    this.selectBatch=selectBatch;
     this.departement=departement;
    this.totalPresent=totalPresent;
    this.totalAbsent=totalAbsent;
 
    }
} 


