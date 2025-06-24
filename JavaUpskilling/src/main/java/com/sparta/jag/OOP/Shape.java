package com.sparta.jag.OOP;

public abstract class Shape {
    // Abstract classes
    public abstract int calculateArea();

    @Override
    public String toString() {
        return getClass().getName() + " Area " + calculateArea();
    }
}
