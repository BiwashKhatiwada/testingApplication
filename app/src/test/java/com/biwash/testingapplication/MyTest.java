package com.biwash.testingapplication;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MyTest {

   @Test
    public void testAddition(){
        Arithematic arithematic=new Arithematic();
        float expected=10;
        float result=arithematic.add(5,5);
        assertEquals(expected,result);
    }
    @Test
    public void testSubtract(){
        Arithematic arithematic=new Arithematic();
        float expected=8;
        float result=arithematic.subtract(5,5);
        assertEquals(expected,result);
    }
    @Test
    public void testMultiply(){
        Arithematic arithematic=new Arithematic();
        float expected=25;
        float result=arithematic.multiply(5,5);
        assertEquals(expected,result);
    }
    @Test
    public void testDivide(){
        Arithematic arithematic=new Arithematic();
        float expected=1;
        float result=arithematic.divide(5,5);
        assertEquals(expected,result);
    }
}

