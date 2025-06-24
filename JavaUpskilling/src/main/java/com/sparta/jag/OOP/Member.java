package com.sparta.jag.OOP;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Member implements Eatable, Moveable {

    // Private fields
    private String firstName;
    private String lastName;
    private LocalDate joinDate;

    // Public methods to expose the private fields we want

    // Ctor - they are a special method
    // Must have the same name as the class
    // No return type is stated, because it returns the Class as a type
    public Member(String firstName, String lastName, int year, int month, int day){
        this.firstName = firstName;
        this.lastName = lastName;
        this.joinDate = LocalDate.of(year, month, day);
    }

    public long getMemberDays(){
        // Comparing the join date, to now, and giving the difference in days
        return joinDate.until(LocalDate.now(), ChronoUnit.DAYS);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getFullName(){
        return firstName + " " + lastName;
    }

    @Override
    public String move() {
        return "I am moving";
    }

    @Override
    public String eat() {
        return "I am eating french fries";
    }
}