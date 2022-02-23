package ch.hicoders.person;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate birthDay;

    public Person(String pFirstName, String pLastName, LocalDate pBirthDay){
        this.setFirstName(pFirstName);
        this.setLastName(pLastName);
        this.setBirthDay(pBirthDay);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }
}
