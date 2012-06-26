package com.claytonlz.fizzbuzz;

import junit.framework.TestCase;
import org.junit.Test;

/**
* Created with IntelliJ IDEA.
* User: clayton
* Date: 6/21/12
* Time: 11:27 AM
* To change this template use File | Settings | File Templates.
*/
public class FizzBuzzEvaluatorTest extends TestCase{
    protected FizzBuzzEvaluator fizzBuzzEvaluator;

    @Test
    public void testNumberThreeAsFizz() throws Exception{
        final String result = new FizzBuzzEvaluator(3).evaluate();
        assertEquals("Fizz", result);
    }

    @Test
    public void testMultiplesOfThreeAsFizz() throws Exception{
        final String result = new FizzBuzzEvaluator(12).evaluate();
        assertEquals("Fizz", result);
    }

    @Test
    public void testNumberFiveAsBuzz() throws Exception{
        final String result = new FizzBuzzEvaluator(5).evaluate();
        assertEquals("Buzz", result);
    }

    @Test
    public void testMultiplesOfFiveAsBuzz() throws Exception{
        final String result = new FizzBuzzEvaluator(25).evaluate();
        assertEquals("Buzz", result);
    }

    @Test
    public void testMultiplesOfThreeAndFiveAsFizzBuzz() throws Exception{
        final String result = new FizzBuzzEvaluator(15).evaluate();
        assertEquals("FizzBuzzEvaluator", result);
    }

}
