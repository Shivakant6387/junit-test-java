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
    void multiplication()throws Exception {
        try {
            int result = calculator.multiplication(2, 4);
            assertTrue(result == 8);
        }catch (NullPointerException e){
            System.out.println(e);
        }
    }

    @Test
    void divison()throws Exception  {
        Calculators calculators=new Calculators();
    try {
        int result=calculators.divison(10,2);
        assertEquals(5,result);
    }catch (Exception e){
        e.printStackTrace(System.err);
    }
    }
    @Test
    void divison_nullPointerException()throws Exception  {
        try {
            int result=calculator.divison(10,2);
            assertEquals(5,result);
        }catch (Exception e){
            e.printStackTrace(System.err);
        }
    }
    @Test
    void divison_ArithmeticException()throws Exception  {
      Calculators calculators=new Calculators();
      try {
          int result=calculators.divison(12,0);
      }
    catch (ArithmeticException e){
          e.printStackTrace();
    }

    }
    @Test
    void equalIntegers() throws Exception{
        try {
            boolean result = calculator.equalIntegers(10, 10);
            assertFalse(result);
        }catch (NullPointerException e){
            System.out.println(e);
        }
    }
}