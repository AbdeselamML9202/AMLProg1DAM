
package GitHubCourse;

/**
 *
 * @author Abdeselam
 */
public class Course {
    private String teacher;
    private String coursename;
    private String courseID;
    private int duration;
    
    public Course(){
        this.teacher="";
        this.coursename="";
        this.courseID="";
        this.duration=0;
    }
    public Course(String n, String tn, String ts, String i, int d){
        if(courseNameCheck(n) && courseDurationCheck(d) && courseIDCheck(i)){
        this.teacher=tn+", "+ts;;
        this.coursename=n;
        this.courseID=i;
        this.duration=d;
        }else{
           System.err.println("Los valores pasado por parametros son inválidos, devolviendo a valores por defecto");
            
        this.teacher="";
        this.coursename="";
        this.courseID="";
        this.duration=0;
        }
    }
    public Course(Course other){
     this.teacher= other.teacher;
     this.coursename=other.coursename;
     this.courseID=other.courseID;
     this.duration=other.duration;
    }
    public boolean courseNameCheck(String n){
        if(n.length()>=4){
            return true;
        }else{
            return false;}
    }
    
    public boolean courseDurationCheck(int h){
        if(h>=30){
            return true;
        }else{
            return false;}
    }
    
    public boolean courseIDCheck(String i){
        if(i.charAt(0)==this.coursename.charAt(0) && i.charAt(i.length()-1)==this.teacher.charAt(0)){
            return true;
        }else{
            return false;}
    }
    
    
    public void setCourseName(String n){
        if(courseNameCheck(n)){
            this.coursename=n;
        }else{
            System.err.println("The course name is way too short");
            this.coursename="";
        }
    }
    
    public void setTeacherName(String n, String s){
        this.teacher=n+", "+s;
    }
    
    public void setCourseID(String i){
        if (courseIDCheck(i)){
            this.courseID=i;
        }else{
            System.err.println("The introduced ID is invalid");
            this.courseID="";
        }   
    }
    public void setDuration(int d){
        if(courseDurationCheck(d)){
            this.duration=d;
        }else{
            System.err.println("The duration isn't long enougth for the course");
            this.duration=-1;
        }
    }
    public String getCourseName(){
        return this.coursename;
    }
    public String getCourseID(){
        return this.courseID;
    }
    public String getTeacher(){
        return this.teacher;
    }
    public int getDuration(){
        return this.duration;
    }
    public String toString(){
        return "The course "+coursename+" with the ID "+courseID+" has "+duration+" hours of duration and "+ teacher+" is its teacher";
    }
    public void copyCourseName(Course other){
        this.coursename=other.coursename;
    }
    
    public void copyTeacherName(Course other){
        this.teacher=other.teacher;
    }
    
    public void copyCourseID(Course other){
        this.courseID=other.courseID;   
    }
    public void copyDuration(Course other){
        this.duration=other.duration;
    }
    public Course clone(){
       Course clon=new Course();
       clon.courseID=this.courseID;
       clon.coursename=this.coursename;
       clon.duration=this.duration;
       clon.teacher=this.teacher;
       return clon;
    }
    public boolean equals(Course other){
        if(this.courseID==other.courseID && this.coursename==other.coursename && this.teacher==other.teacher && this.duration==other.duration){
            return true;
        }else{
            return false;
        }
    }
}
