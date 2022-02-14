/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fourth_Task.Github;

/**
 *
 * @author ismael
 */
public class ITCourse extends OnlineCourse{
    private String specializaton;
    
    public ITCourse(){
        this.setName("");
        this.setDuration(0);
        this.setTeacher("");
        this.setID("");
        specializaton="";
    }

    public ITCourse(String specialization, String name, String id, String teacher){
        if(this.typeSpecialization(specialization)){
            this.specializaton=specialization;
        }
        
        this.setName(name);
        this.setTeacher(teacher);
        this.setID(id);
        
        
    }
    
    public ITCourse (ITCourse copy){
        this.setName(copy.getName());
        this.setTeacher(copy.getTeacher());
        this.setID(copy.getID());
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
        if(this.getName()==compare.getName()){
            if(this.getTeacher()==compare.getTeacher()){
                if(this.getID()==compare.getID()){
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
        return this.getName()+" with the id "+ this.getID()+" alumn of "+ this.getTeacher()+" study a course of "+this.specializaton
        +" with a duration "+this.getDuration();
    }
}




