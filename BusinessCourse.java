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
import java.time.LocalTime;

public class BusinessCourse extends Course {

    BusinessCourse() {
        setCourseName("");
        setCourseID("");
        setTeacherName("","");
        setDuration(0);
    }

    BusinessCourse(String name, String id, String teacher_name, String teacher_surname, String dur) {
        setCourseName(name);
        setCourseID(id);
        setTeacherName(teacher_name, teacher_surname);
        if (Integer.parseInt(dur) == 45) {
            int entero = Integer.parseInt(dur);
            LocalTime tiempo = LocalTime.of( entero, 0, 0); 
            setDuration(tiempo.getHour());
        }else{
            System.err.println("Error, the duration is invalid");
        }

    }

    BusinessCourse(BusinessCourse copy) {
        this.setCourseName(copy.getCourseName());
        this.setCourseID(copy.getCourseID());
        this.setDuration(copy.getDuration());
        this.setTeacherName(copy.getTeacher(), "");
    }

    public String toString() {
        return "the course" + this.getCourseName()+ "with an id" + getCourseID() + "is with a duration" + getDuration() + "of which is taught by the teacher" + getTeacher();
    }

    public BusinessCourse clone() {
        BusinessCourse clone=new BusinessCourse(this);
        return clone;
    }

    public boolean equals(BusinessCourse other) {
        if (this.getCourseName() == other.getCourseName() && getDuration() == other.getDuration() && getTeacher() == other.getTeacher() && this.getCourseID() == other.getCourseID()) {
            return true;
        }
        return false;
    }
}
