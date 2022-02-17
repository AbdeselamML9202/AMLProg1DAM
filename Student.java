package Bilingual_Fourth_task;

public class Student extends Person{
    
    BusinessCourse course1;
    public Student(){
        setName("");
        setSurname("");
        setEmail("");
        course1 = new BusinessCourse();
    }
    
    public Student(Student other){
        setName(other.getName());
        setSurname(other.getSurname());
        setEmail(other.getEmail());
    }
    
    public Student(String name, String surname, String email, String namecourse, String id, String teacher, String duration){
        setName(name);
        setSurname(surname);
        setEmail(email);
        course1 = new BusinessCourse(namecourse, id, teacher, duration);
        
    }
    
    public String toString(){
        return getName()+" "+getSurname()+" with email: "+getEmail();
    }
   
    public boolean equals(Person copy){
        if(getName()==copy.getName()){
            if(getSurname()==copy.getSurname()){
                if(getEmail()==copy.getEmail()){
                    return true;
                }
            }
        }
        return false;
    }
    
    public Student clone(Student copy){
        setName(copy.getName());
        setSurname(copy.getSurname());
        setEmail(copy.getEmail());  
        return copy;
    }
}