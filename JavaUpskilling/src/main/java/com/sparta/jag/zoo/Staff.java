package com.sparta.jag.zoo;

import java.time.LocalDate;

public abstract class Staff implements Speakable{

    private LocalDate dateOfEmployment;
    private Integer shiftTimes;
    private String name;
    private String assignedEnclosure;

    public Staff(LocalDate dateOfEmployment, Integer shiftTimes, String name, String assignedEnclosure) {
        this.dateOfEmployment = dateOfEmployment;
        this.shiftTimes = shiftTimes;
        this.name = name;
        this.assignedEnclosure = assignedEnclosure;
    }

    @Override
    public String speak() {
        return "I have fed the Lions!";
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(LocalDate dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public Integer getShiftTimes() {
        return shiftTimes;
    }

    public void setShiftTimes(Integer shiftTimes) {
        this.shiftTimes = shiftTimes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssignedEnclosure() {
        return assignedEnclosure;
    }

    public void setAssignedEnclosure(String assignedEnclosure) {
        this.assignedEnclosure = assignedEnclosure;
    }
}
