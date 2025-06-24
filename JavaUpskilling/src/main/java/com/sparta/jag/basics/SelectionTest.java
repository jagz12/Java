package com.sparta.jag.basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SelectionTest {

    @Test
    @DisplayName("Given 64, Return Fail")
    public void givenMarkLessThan65_GetGradeIfElse_ReturnsFalse(){
        Assertions.assertEquals("Fail", Selection.getGradeIfElse(64));
    }
}
