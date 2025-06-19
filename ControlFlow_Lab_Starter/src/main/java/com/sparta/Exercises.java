package com.sparta;

public class Exercises {

    // Question 1 change this method so that it uses the ternary operator ?
    public static String getForecast(int temp) {
        return (temp < 15) ? "It's cold" : "It's hot";
    }
//        if (temp < 15)
//            return "It's cold";
//        else
//            return "It's hot";
//    }

    // Question 2
    // returns the average of the array nums
    public static double average(int[] nums) {
        return -1;
    }

    // Question 3

    // returns the type of ticket a customer is eligible for based on their age
    // "Standard" if they are between 18 and 59 inclusive
    // "OAP" if they are 60 or over
    // "Student" if they are 13-17 inclusive
    // "Child" if they are 5-12
    // "Free" if they are under 5
    public static String ticketType(int age) {
        String ticketType = "";

        // Ask Nish? why does the above work?

        if (age >= 60) {
            ticketType = "OAP";
        } else if (age >= 18) {
            ticketType = "Standard";
        } else if (age >= 13) {
            ticketType = "Student";
        } else if (age >= 5) {
            ticketType = "Child";
        } else {
            ticketType = "Free";
        }
        return ticketType;
    }

    // Question 4

    // Ask Nish what the underline is indicating ??

    public static String grade(int mark) {
        var grade = "result";
        if (mark >= 75) {
            grade = "Pass with Distinction";
        } else if (mark >= 60 && mark <= 74) {
            grade = "Pass with Merit";
        } else if (mark >= 40 && mark <= 59) {
            grade = "Pass";
        } else {
            grade = "Fail";
        }
        return grade;
    }

    // Question 5
    public static int getScottishMaxWeddingNumber(int covidLevel) {
//        var level = "Number"
//        return 0;
            int maxAttendees;

            switch (covidLevel) {
                case 4:
                    maxAttendees = 20;
                    break;
                case 3:
                case 2:
                    maxAttendees = 50;
                    break;
                case 1:
                    maxAttendees = 100;
                    break;
                case 0:
                    maxAttendees = 200;
                    break;
                default:
                    maxAttendees = 0; // Return 0 for unknown levels
                    break;
            }
        }
