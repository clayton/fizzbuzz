package com.claytonlz.fizzbuzz;

/**
 * Created with IntelliJ IDEA.
 * User: clayton
 * Date: 6/26/12
 * Time: 3:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class FizzBuzzPrinter {
    private String input;

    public FizzBuzzPrinter(String s) {
        this.setInput(s);
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
}
