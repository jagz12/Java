package com.sparta.jag.cucumber;

public class Calculator {

    private int num1;
    private int num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int add() {
        return num1 + num2;
    }

    public Integer subtract() {
        return num1 - num2;
    }

    public Integer multiply() {
        return num1 * num2;
    }

    public Integer divide() {
        return num1 / num2;
    }
}
