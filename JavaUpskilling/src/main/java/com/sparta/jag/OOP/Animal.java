package com.sparta.jag.OOP;

import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;

public abstract class  Animal implements Eatable {

    private String animalName;
    private LocalDate birthDate;


    public Animal(String animalName, int year, int month, int day){
        this.animalName = animalName;
        this.birthDate = LocalDate.of(year, month, day);
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public long getAge(){
        // comparing the birth date, to now, and giving the difference in year
        return birthDate.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    public abstract String speak();


}
