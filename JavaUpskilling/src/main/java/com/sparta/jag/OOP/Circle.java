package com.sparta.jag.OOP;

public class Circle extends Shape{
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public int calculateArea() {
        return (int)(radius * radius * Math.PI);
    }
}
