package com.sparta.jag;

public class Selection {
    public static void main(String[] args) {
        System.out.println(getGradeIfElse(86));
    }

    public static String getGradeIfElse(int mark){
        if(mark >= 85){
            return "Distinction";
        } else if (mark >= 65){
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static String priority(int level){

        String priority = "Code ";
        switch (level){
            case 3:
                priority = priority + "Red";
                break;
            case 2:
            case 1:
                priority = priority + "Amber";
                break;
            default:
                priority = "Error";
                break;
        }
        return priority;
    }
}
