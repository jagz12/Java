package com.sparta.jag;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GreetingTest {

    @Test
    @DisplayName("MyFirstTest")
    public void firstTest(){
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("Greeting returns good evening with input of 21")
    public void greeting_ReturnsGoodEvening_input21(){
        // Arrange
        int time = 21;
        String expected = "Good evening";
        //Act - Call method under test
        String actual = Main.greeting(time);

        //Assert
        Assertions.assertEquals(expected, actual);
    }

    // Write a test for Good morning

    @Test
    @DisplayName("Greeting returns good morning with an inout of 11")
    public void greeting_ReturnsGoodMorning_input11(){
        int time = 11;
        String expected = "Good morning";
        String actual = Main.greeting(time);
        Assertions.assertEquals(expected, actual);
    }
}
