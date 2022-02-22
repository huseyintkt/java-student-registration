package ch.hicoders;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        Student student1 = new Student("Ahmet","Memis", LocalDate.parse("2000-12-01"));
        Student student2 = new Student("Okkes","Memis", LocalDate.parse("2000-11-01"));
        Student student3 = new Student("Ayse","Memis", LocalDate.parse("2000-12-11"));
        Student student4 = new Student("Ali","Memis", LocalDate.parse("2000-12-12"));
        Student student5 = new Student("Veli","Memis", LocalDate.parse("2000-12-13"));
        Student student6 = new Student("Mehmet","Memis", LocalDate.parse("2000-12-14"));
        Student student7 = new Student("Huseyin","Memis", LocalDate.parse("2000-12-15"));
        Student student8 = new Student("Osman","Memis", LocalDate.parse("2000-12-16"));
        Student student9 = new Student("Bekir","Memis", LocalDate.parse("2000-12-17"));
        Student student10 = new Student("Fatih","Memis", LocalDate.parse("2000-12-18"));

        Student[] studentGroup1 = {student1, student2, student3, student4};
        Student[] studentGroup2= {student5, student6, student7, student8, student9, student10};

        Teacher teacher1 = new Teacher("Cevdet","Demir", LocalDate.parse("1988-12-01"), Specialty.MATH);
        Teacher teacher2 = new Teacher("Aslı","Demir", LocalDate.parse("1990-12-01"), Specialty.ENGLISH);

        Classroom classroom1 = new Classroom(teacher1,studentGroup1,"Zurih","Class A");
        Classroom classroom2 = new Classroom(teacher2,studentGroup2,"Luzern","Class B");
    }
}
