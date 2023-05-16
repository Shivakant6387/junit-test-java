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
    void should_assert_not_equals_when_calculateBMI() {
        //given
        BMICalculator bmiCalculator=new BMICalculator();
        double height=1.75;
        double weight=70;
        double expectedBMI=26.86;
        //when
        double result=bmiCalculator.calculateBMI(height,weight);
        //then
        assertNotEquals(expectedBMI,result,0.01);
    }

    @Test
    void should_assert_true_when_isUnderweight() {
        //given
        BMICalculator bmiCalculator=new BMICalculator();
        double bmi=17.5;
        //when
        boolean result=bmiCalculator.isUnderweight(bmi);
        //then
        assertTrue(result);
    }
    @Test
    void should_assert_false_when_is_not_Underweight() {
        //given
        BMICalculator bmiCalculator=new BMICalculator();
        double bmi=19.5;
        //when
        boolean result=bmiCalculator.isUnderweight(bmi);
        //then
        assertFalse(result);
    }

    @Test
    void isNormalWeight() {
    }
}