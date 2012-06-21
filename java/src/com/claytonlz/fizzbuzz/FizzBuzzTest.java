package com.claytonlz.fizzbuzz;

import static org.junit.Assert.assertEquals;

/**
* Created with IntelliJ IDEA.
* User: clayton
* Date: 6/21/12
* Time: 11:27 AM
* To change this template use File | Settings | File Templates.
*/
public class FizzBuzzTest {
    protected FizzBuzz fizzBuzz;
    @org.junit.Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    public void testNumberThreeAsFizz() throws Exception{
        assertEquals(fizzBuzz.evaluate(3), "Buzz");
    }
}
