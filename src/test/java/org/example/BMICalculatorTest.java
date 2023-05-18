package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.Executable;

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
    @ParameterizedTest
    @ValueSource(doubles = {1.6,1.8,1.7,1.9,1.3,1.4})
    void should_assert_return_true_multiply_value_when_isUnderweight(Double coreBmi) {
        BMICalculator bmiCalculator=new BMICalculator();
       double bmi=coreBmi;
        boolean result=bmiCalculator.isUnderweight(bmi);
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
    void should_assert_true_isNormalWeight() {
        //given
        BMICalculator bmiCalculator=new BMICalculator();
        double bmi=23.0;
        //when
        boolean result=bmiCalculator.isNormalWeight(bmi);
        //then
        assertTrue(result);
    }
    @Test
    void should_assert_false_is_not_NormalWeight() {
        //given
        BMICalculator bmiCalculator=new BMICalculator();
        double bmi=235.0;
        //when
        boolean result=bmiCalculator.isNormalWeight(bmi);
        //then
        assertFalse(result);
    }
    @Test
    void should_assert_throws_when_CalculatesBMI(){
        BMICalculator calculator = new BMICalculator();
        double height = 1.75; // in meters
        double weight = 0.0; // invalid weight
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculatesBMI(height, weight);
        });
    }
}