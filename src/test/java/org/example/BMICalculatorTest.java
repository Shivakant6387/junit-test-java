package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    @Test
    void should_assert_equals_when_calculateBMI() {
        //given
        BMICalculator bmiCalculator=new BMICalculator();
        double height=1.75;
        double weight=70;
        double expectedBMI=22.86;
       //when
        double result=bmiCalculator.calculateBMI(height,weight);
       //then
        assertEquals(expectedBMI,result,0.01);
    }

    @Test
    void isUnderweight() {
    }

    @Test
    void isNormalWeight() {
    }
}