package com.sparta.jag.basics;

public class Loops {
    public static void main(String[] args) {

        //Array when initialised has to be initialised with values or if no values, the length its going to be
        // IMMUTABLE!

        // if you want to declare a variable (example) which as an array can only take doubles
        // Initialising the array with Values
        // Initialised with 3 values, the maz size
        double[] example = new double[]{2.0, 1.0, 20.0};
        double indexOne = example[0];
        double indexThree = example[2];

        // datatype followed by []
        double[] weights = new double[4];
        System.out.println(weights[2]);


    }
}