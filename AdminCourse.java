/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GitHubCourse;

/**
 *
 * @author Abdeselam
 */
public class AdminCourse extends Course{
    public AdminCourse(){
        this.setCourseName("");
        this.setTeacherName("", "");
        this.setCourseID("");
        this.setDuration(0);
    }
    public AdminCourse(AdminCourse other){
        this.copyCourseName(other);
        this.copyTeacherName(other);
        this.copyCourseID(other);
        this.copyDuration(other);
    }
    public AdminCourse(String n, String tn, String ts, String i, String d){
        int du= Integer.parseInt(d);
        if(this.courseNameCheck(n) && this.courseIDCheck(i) && courseDurationCheck(du)){
        this.setCourseName(n);
        this.setTeacherName(tn, ts);
        this.setCourseID(i);
        this.setDuration(du);
    }
    }
    
    public boolean courseDurationCheck(int h){
        if(h>=40){
            return true;
        }else{
            return false;}
    }
    public void setCourseName(String n){
       this.setCourseName(n);
    }
    
    public void setCourseID(String n){
       this.setCourseID(n);
    }
    public void setTeacherName(String n, String m){
       this.setTeacherName(n, m);
    }
    public void setDuration(String n){
         int m= Integer.parseInt(n);
       this.setDuration(m);
    }
    public String getCourseName(){
       return this.getCourseName();
    }
    
    public String getCourseID(String n){
       return this.getCourseID();
    }
    public String getTeacher(){
       return this.getTeacher();
    }
    public int getDuration(){
       return this.getDuration();
    }
     public String toString(){
        return "The Admin Course "+this.getCourseName()+" with the ID "+this.getCourseID()+" has "+this.getDuration()+" hours of duration and "+this.getTeacher()+" is its teacher";
    }
    
}
