package ch.hicoders.classroom;

import ch.hicoders.person.Person;
import ch.hicoders.student.Student;
import ch.hicoders.teacher.Teacher;

public class Classroom {
    private Person teacher;
    private Person[] students;
    private String location;
    private String name;

    public Classroom(Person pTeacher, Person[] pStudents, String pLocation, String pName){
        this.setTeacher(pTeacher);
        this.setStudents(pStudents);
        this.setLocation(pLocation);
        this.setName(pName);
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    public void setStudents(Person[] students) {
        this.students = students;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }
}
