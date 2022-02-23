package ch.hicoders.teacher;

import ch.hicoders.person.Person;

import java.time.LocalDate;

public class Teacher extends Person {
    private Specialty specialty;

    public Teacher(String pFirstName, String pLastName, LocalDate pBirthDay, Specialty pSpecialty){
        super(pFirstName, pLastName, pBirthDay);
        this.setSpecialty(pSpecialty);
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }
}
