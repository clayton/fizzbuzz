package com.claytonlz.fizzbuzz;

import junit.framework.TestCase;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.lib.legacy.ClassImposteriser;
import org.junit.Test;

/**
* Created with IntelliJ IDEA.
* User: clayton
* Date: 6/21/12
* Time: 11:27 AM
* To change this template use File | Settings | File Templates.
*/
public class FizzBuzzTest extends TestCase{
    protected FizzBuzz fizzBuzz;

    @org.junit.Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testNumberThreeAsFizz() throws Exception{
        assertEquals("Fizz", fizzBuzz.evaluate(3));
    }

    @Test
    public void testMultiplesOfThreeAsFizz() throws Exception{
        assertEquals("Fizz", fizzBuzz.evaluate(12));
    }

    @Test
    public void testNumberFiveAsBuzz() throws Exception{
        assertEquals("Buzz", fizzBuzz.evaluate(5));
    }

    @Test
    public void testMultiplesOfFiveAsBuzz() throws Exception{
        assertEquals("Buzz", fizzBuzz.evaluate(25));
    }

    @Test
    public void testMultiplesOfThreeAndFiveAsFizzBuzz() throws Exception{
        assertEquals("FizzBuzz", fizzBuzz.evaluate(15));
    }

}
