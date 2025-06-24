package com.sparta.jag.OOP;

public class Dog extends Animal{

    private String coat;


    public Dog(String animalName, String coat, int year, int month, int day) {
        super(animalName, year, month, day);
        this.coat = coat;
    }

    public String getCoat() {
        return coat;
    }

    public void setCoat(String coat) {
        this.coat = coat;
    }

    @Override
    public String speak() {
        return "Woof";
    }

    @Override
    public String eat() {
        return "I am eating dog food";
    }

}
