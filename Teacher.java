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
public class Teacher extends Person{
    private int studentNumber;
    private Student students[];
    private Course teachingCourse;
    
    public Teacher(){
        this.setName("");
        this.setEmail("");
        this.setSurname("");
        studentNumber=0;
        students=new Student[studentNumber];
        teachingCourse=new Course();
    }
    public Teacher(String n, String e, String s, int sn, Student[] classr, Course teach){
        this.setName(n);
        this.setEmail(e);
        this.setSurname(s);
        studentNumber=0;
        students=new Student[studentNumber];
        for(int i=1; i<=studentNumber; i++){
            students[i]= classr[i];
        }
        teachingCourse= teach;
    }
    public Teacher(Teacher copy){
        this.setName(copy.getName());
        this.setEmail(copy.getEmail());
        this.setSurname(copy.getSurname());
        this.studentNumber=copy.getStudentNumber();
        this.students=copy.getStudents();
        this.teachingCourse= getTeachingCourse();
    }
    public void setStudentNumber(int n){
        studentNumber=n;
    }
    public void setStudents(Student[] classr){
        students=new Student[studentNumber];
        for(int i=1; i<=studentNumber; i++){
            students[i]= classr[i];
        }
    }
    public void setTeachingCourse(Course c){
        teachingCourse=c;
    }
    public int getStudentNumber(){
        return studentNumber;
    }
    public Student[] getStudents(){
        return students;
    }
    public Course getTeachingCourse(){
        return teachingCourse;
    }
    public String toString(){
        return this.getName()+" "+this.getSurname()+" with email: "+this.getEmail()+", teachs "+teachingCourse.getCourseName()+" to "+ students.toString();
    }
   
    public boolean equals(Teacher copy){
        if(this.getName()==copy.getName() && this.getEmail()==copy.getEmail() && this.getSurname()==copy.getSurname() && this.teachingCourse==copy.teachingCourse && this.students==copy.students && this.studentNumber==copy.studentNumber){
            return true;
        }
        return false;
    }
   
   
    public Teacher clone(){
        Teacher clone=new Teacher(this);
        return clone;
    }
}
