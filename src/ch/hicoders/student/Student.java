package ch.hicoders.student;

import ch.hicoders.person.Person;

import java.time.LocalDate;

public class Student extends Person {

    public Student(String pFirstName, String pLastName, LocalDate pBirthDay){
        super(pFirstName, pLastName, pBirthDay);
    }
}
