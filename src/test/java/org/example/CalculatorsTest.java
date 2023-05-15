package org.example;

import org.junit.jupiter.api.*;

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
    @BeforeEach
    void test_before_each(){
        System.out.println("Hey test is complete start");
    }
    @AfterEach
    void test_after_each(){
        System.out.println("Test is complete end.Bye");
    }
    @Test
    void sum() {
        Calculators calculators=new Calculators();
        int sum=calculators.sum(12,34);
        assertEquals(46,sum);

    }
    @Test
    void sum_not_equals() {
        Calculators calculators=new Calculators();
        int sum=calculators.sum(12,34);
        assertNotEquals(89,sum);

    }

    @Test
    void subtraction() {
        Calculators calculators=new Calculators();
        int sub=calculators.subtraction(12,4);
        assertTrue(sub==8);
    }
    @Test
    void subtraction_false() {
        Calculators calculators=new Calculators();
        int sub=calculators.subtraction(12,4);
        assertFalse(sub==3);
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