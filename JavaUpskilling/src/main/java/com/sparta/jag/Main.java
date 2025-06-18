package com.sparta.jag;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String film = FilmClassification.getClassificationsByAge(1);
        System.out.println(film);







        System.out.println();
        int num = 3;
        num = 3;
        String name = "jag";
        boolean isReadyToLearn = true;
        int count = 10;
        int newCount = count * 2;
        newCount++;

        String[] fruits = new String[]{"Oranges", "Appples", "Pears"};

        int result = subtract(7, 4);
        System.out.println(result);

        String hello = sayHello(  "jag");
        System.out.println("Hello");


            int timeOfDay = 5;
            String result2 = greeting(timeOfDay);
        System.out.println(result2);
    }

    public static String sayHello(String name){
        return "Hello" + name;
    }

    public static Integer add(int num1, int num2){
        int result = num1 + num2;
        return result;
    }

    public static Integer subtract(int num1, int num2){
        int result = num1 - num2;
        return result;
    }

    public static String greeting(int timeOfDay) {
        if(timeOfDay >= 5 && timeOfDay <12 ){
            return "Good morning";
        } else if (timeOfDay >= 12 && timeOfDay <=18){
            return "Good afternoon";
        } else {
            return "Good evening";
        }
    }

//write a test for good morning



}