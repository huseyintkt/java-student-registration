package ch.hicoders.classroom;

import ch.hicoders.student.Student;
import ch.hicoders.teacher.Teacher;

public class Classroom {
    private Teacher teacher;
    private Student[] students;
    private String location;
    private String name;

    public Classroom(Teacher pTeacher, Student[] pStudents, String pLocation, String pName){
        this.setTeacher(pTeacher);
        this.setStudents(pStudents);
        this.setLocation(pLocation);
        this.setName(pName);
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }
}
