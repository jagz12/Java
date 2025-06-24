package com.sparta.jag.OOP;

public class Rectangle extends Shape{

    private int height;
    private int length;

    public Rectangle(int height, int length) {
        this.height = height;
        this.length = length;
    }

    @Override
    public int calculateArea() {
        return length * height;
    }

    public int add() {
        return 1;
    }
}
