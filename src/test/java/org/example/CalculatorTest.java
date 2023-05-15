package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  @Test
    void should_return_true_when_evaluate() {
    //given
    Calculator calculator=new Calculator();
    //when
    int sum=calculator.evaluate("1+2+3");
    //then
    assertEquals(6,sum);
    }
    void should_return_not_equals_when_evaluate(){
    //given
    Calculator calculator=new Calculator();
    // when
      int sum=calculator.evaluate("2+3+4");
    //then
    assertNotEquals(10,sum);
    }
}