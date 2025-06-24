package com.sparta.jag.OOP;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AnimalTests {
    private Dog Spike;

    @BeforeEach
    public void createDog() {
        Spike = new Dog("Spike", "Brown", 2023, 11, 3);
    }

    @Test
    @DisplayName("GetDogName")
    public void getDogName() {
        String expected = "Spike";
        String actual = Spike.getAnimalName();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("GetCoat")
    public void getCoat() {
        String expected = "Brown";
        String actual = Spike.getCoat();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("How Dog Speaks")
    public void DogSpeaks() {
        String expected = "Woof";
        String actual = Spike.speak();
        Assertions.assertEquals(expected, actual);
    }
}
