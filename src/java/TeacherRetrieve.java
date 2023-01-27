/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Reyan
 */

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TeacherRetrieve {
 public String getTeacherName() {
        return teacherName;
    }

    public int getTeacherid() {
        return teacherid;
    }

    public String getDate() {
        return date;
    }

    public String getPass() {
        return pass;
    }

    public String getStat() {
        return stat;
    }


 

  private final String teacherName;
   private final int teacherid;
   private final String date;
  private final String pass;
  private final String stat;
    
    public TeacherRetrieve(String teacherName, int teacherid, String date, String pass, String stat)
    {
    this.teacherName =teacherName;
    this.teacherid=teacherid;
     this.date=date;
    this.pass=pass;
    this.stat=stat;
    
    }
} 



