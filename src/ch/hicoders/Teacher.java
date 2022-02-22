package ch.hicoders;

import java.time.LocalDate;

public class Teacher extends Person{
    private Specialty specialty;

    public Teacher(String pFirstName, String pLastName, LocalDate pBirthDay, Specialty pSpecialty){
        super(pFirstName, pLastName, pBirthDay);
        this.setSpecialty(pSpecialty);
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }
}
