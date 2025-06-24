package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercises_Tests {
    @Test
    @DisplayName("Given a temperature less than 15, getForecast returns It's cold")
    public void getForecast_Cold() {
        assertEquals("It's cold", Exercises.getForecast(14) );
    }

    @Test
    @DisplayName("Given a temperature of 15, getForecast returns It's hot")
    public void getForecast_Hot() {
        assertEquals("It's hot", Exercises.getForecast(15) );
    }

    @Test
    @DisplayName("Given a temperature over 15, getForecast returns It's hot")
    public void getForecast_Over15_Hot() {
        assertEquals("It's hot", Exercises.getForecast(125));
    }
    @Test
    @DisplayName("Average returns correct average")
    public void Average_ReturnsCorrectAverage()
    {
        int[] nums = { 3, 8, 1, 7, 3 };
        assertEquals(4.4, Exercises.average(nums));
    }

    @Test
    @DisplayName(("When the Array is empty average returns zero"))
    public void WhenArrayIsEmpty_Average_ReturnsZero()
    {
        int[] nums = {  };
        assertEquals(0, Exercises.average(nums));
    }

    @ParameterizedTest
    @CsvSource( {
            "100, OAP",
            "60, OAP",
            "59, Standard",
            "18, Standard",
            "17, Student",
            "13, Student",
            "12, Child",
            "5, Child",
            "4, Free",
            "0, Free"
    })
    @DisplayName("Testing ticket types by age")
    public void TicketTypeTest(int age, String expected)
    {
        var result = Exercises.ticketType(age);
        assertEquals(expected, result);
    }

    // write unit tests for the 'Grade' method here

    // Ask nISH - explain what Assertions.assertEquals means exactly
    // Why does this show only 1 test passed?

    @Test
    @DisplayName("Final Mark based on grade")
    public void ReturnResultBasedOnFinalGrade_Distinction(){
        assertEquals("Pass with Distinction", Exercises.grade(80));
    }

    @Test
    @DisplayName("Final Mark based on grade")
    public void ReturnResultBasedOnFinalGrade_Merit(){
        assertEquals("Pass with Merit", Exercises.grade(65));
    }

    @Test
    @DisplayName("Final Mark based on grade")
    public void ReturnResultBasedOnFinalGrade_Pass() {
        assertEquals("Pass", Exercises.grade(45));
    }

    @Test
    @DisplayName("Final Mark based on grade")
    public void ReturnResultBasedOnFinalGrade_Fail() {
        assertEquals("Fail", Exercises.grade(20));
    }

    // write unit tests for the Scottish wedding example here

        @Test
        public void testLevel4() {
            assertEquals(20, Exercises.getScottishMaxWeddingNumber(4));
        }

        @Test
        public void testLevel3() {
            assertEquals(50, Exercises.getScottishMaxWeddingNumber(3));
        }

        @Test
        public void testLevel2() {
            assertEquals(50, Exercises.getScottishMaxWeddingNumber(2));
        }

        @Test
        public void testLevel1() {
            assertEquals(100, Exercises.getScottishMaxWeddingNumber(1));
        }

        @Test
        public void testLevel0() {
            assertEquals(200, Exercises.getScottishMaxWeddingNumber(0));
        }

        @Test
        public void testInvalidLevel() {
            assertEquals(0, Exercises.getScottishMaxWeddingNumber(5)); // or -1
        }
    }

