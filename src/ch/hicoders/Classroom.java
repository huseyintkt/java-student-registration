package ch.hicoders;

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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
