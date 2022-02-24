package ch.hicoders;

import ch.hicoders.classroom.Classroom;
import ch.hicoders.person.Person;
import ch.hicoders.student.Student;
import ch.hicoders.teacher.Specialty;
import ch.hicoders.teacher.Teacher;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        Person student1 = new Student("Ahmet","Memis", LocalDate.parse("2000-12-01"));
        Person student2 = new Student("Okkes","Memis", LocalDate.parse("2000-11-01"));
        Person student3 = new Student("Ayse","Memis", LocalDate.parse("2000-12-11"));
        Person student4 = new Student("Ali","Memis", LocalDate.parse("2000-12-12"));
        Person student5 = new Student("Veli","Memis", LocalDate.parse("2000-12-13"));
        Person student6 = new Student("Mehmet","Memis", LocalDate.parse("2000-12-14"));
        Person student7 = new Student("Huseyin","Memis", LocalDate.parse("2000-12-15"));
        Person student8 = new Student("Osman","Memis", LocalDate.parse("2000-12-16"));
        Person student9 = new Student("Bekir","Memis", LocalDate.parse("2000-12-17"));
        Person student10 = new Student("Fatih","Memis", LocalDate.parse("2000-12-18"));

        Person[] studentGroup1 = {student1, student2, student3, student4};
        Person[] studentGroup2= {student5, student6, student7, student8, student9, student10};

        Person teacher1 = new Teacher("Cevdet","Demir", LocalDate.parse("1988-12-01"), Specialty.MATH);
        Person teacher2 = new Teacher("Aslı","Demir", LocalDate.parse("1990-12-01"), Specialty.ENGLISH);

        Classroom classroom1 = new Classroom(teacher1,studentGroup1,"Zurih","Class A");
        Classroom classroom2 = new Classroom(teacher2,studentGroup2,"Luzern","Class B");
    }
}
