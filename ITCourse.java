/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GitHubCourse;

/**
 *
 * @author ismael
 */
public class ITCourse extends Course{
    private String specializaton;
    
    public ITCourse(){
        this.setCourseName("");
        this.setDuration(0);
        this.setTeacherName("","");
        this.setCourseID("");
        specializaton="";
    }

    public ITCourse(String specialization, String name,String surname, String id, String teacher){
        if(this.typeSpecialization(specialization)){
            this.specializaton=specialization;
        }
        
        this.setCourseName(name);
        this.setTeacherName(teacher, "");
        this.setCourseID(id);
        
        
    }
    
    public ITCourse (ITCourse copy){
        this.setCourseName(copy.getCourseName());
        this.setTeacherName(copy.getTeacher(),"");
        this.setCourseID(copy.getCourseID());
        this.specializaton=copy.specializaton;
    }
    
    
    
    
    public boolean typeSpecialization(String specialization){
        switch(specialization){
            case ("Networking"):
                this.setDuration(35);
                break;
                
            case ("Programing"):
                this.setDuration(50);
                break;
                
            case ("Sysadmin"):
                this.setDuration(40);
                break;
                
            default:
                System.err.println("Error");
                return false;
        }
        return true;
        
    }
    
    public ITCourse clone(){
        ITCourse clone=new ITCourse(this);
        return clone;
    }
    
    
    public boolean equals(ITCourse compare){
        if(this.getCourseName()==compare.getCourseName()){
            if(this.getTeacher()==compare.getTeacher()){
                if(this.getCourseID()==compare.getCourseID()){
                    if(this.specializaton==compare.specializaton){
                        if(this.getDuration()==compare.getDuration()){
                            return true;
                        }else{
                            System.err.println("Error");
                            return false;
                        }
                    }else{
                        System.err.println("Error");
                        return false;
                    }
                }else{
                    System.err.println("Error");
                    return false;
                }
            }else{
                System.err.println("Error");
                return false;
            }
        }else{
            System.err.println("Error");
            return false;
        }
    }
    
    public String toString(){
        return this.getCourseName()+" with the id "+ this.getCourseID()+" alumn of "+ this.getTeacher()+" study a course of "+this.specializaton
        +" with a duration "+this.getDuration();
    }
}



