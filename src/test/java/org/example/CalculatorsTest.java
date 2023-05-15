package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorsTest {
    private static ICalculator calculator;
    @BeforeAll
    static void test_SuccessFully_Start(){
        System.out.println("Test Started");
    }
    @AfterAll
    static void test_SuccessFully_End(){
        System.out.println("test ended");
    }
    @Test
    void sum() {
        Calculators calculators=new Calculators();
        int sum=calculators.sum(12,34);
        assertEquals(46,sum);

    }

    @Test
    void subtraction() {
        Calculators calculators=new Calculators();
        int sub=calculators.subtraction(12,4);
        assertTrue(sub==8);
    }

    @Test
    void multiplication() {
    }

    @Test
    void divison() {
    }

    @Test
    void equalIntegers() {
    }
}