package Bilingual_Fourth_task;

import java.time.LocalTime;

public class BusinessCourse extends Course {

    BusinessCourse() {
        setName("");
        setID("");
        setTeacher("");
        setDuration(null);
    }

    BusinessCourse(String name, String id, String teacher, String duration) {
        setName(name);
        setID(id);
        setTeacher(teacher);
        if (Integer.parseInt(duration) == 45) {
            setDuration(LocalTime.of(Integer.parseInt(duration), 0, 0));
        }else{
            System.err.println("Error, the duration is invalid");
        }

    }

    BusinessCourse(BusinessCourse copy) {
        this.setName(copy.getName());
        this.setID(copy.getID());
        this.setDuration(copy.getDuration());
        this.setTeacher(copy.getTeacher());
    }

    public String toString() {
        return "the course" + this.getName() + "with an id" + getID() + "is with a duration" + getDuration() + "of which is taught by the teacher" + getTeacher();
    }

    public BusinessCourse clone(BusinessCourse copy) {
        this.setName(copy.getName());
        this.setID(copy.getID());
        this.setDuration(copy.getDuration());
        this.setTeacher(copy.getTeacher());
        return copy;
    }

    public boolean equals(BusinessCourse other) {
        if (this.getName() == other.getName() && getDuration() == other.getDuration() && getTeacher() == other.getTeacher() && this.getID() == other.getID()) {
            return true;
        }
        return false;
    }
}
