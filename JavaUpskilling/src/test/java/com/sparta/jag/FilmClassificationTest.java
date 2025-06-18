package com.sparta.jag;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FilmClassificationTest {

    @Test
    @DisplayName("First Unit Test")
    public void filmClassificationReturns_U_PG_filmsAreAvailable(){
        //Arrange
        int age = 11;
        String expected = "U, PG films are available.";
        // Act - Call method under test
        String actual = FilmClassification.getClassificationsByAge(age);
        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Boundary Test")
    public void filmClassification_U_PG_12_filmsAreAvailable_WhenInput_12(){
        //Arrange
        int age = 12;
        String expected = "U, PG, 12 films are available.";
        // Act - Calling method under test
        String actual = FilmClassification.getClassificationsByAge(age);
        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Second Unit Test")
    public void filmClassificationPleaseEnterACorrectAge_WhenInputMinus1(){
        //Arrange
        int age = -1;
        String expected = "Please enter a correct age.";
        //Act
        String actual = FilmClassification.getClassificationsByAge(age);
        //Assert
        Assertions.assertEquals(expected, actual);
    }
}
