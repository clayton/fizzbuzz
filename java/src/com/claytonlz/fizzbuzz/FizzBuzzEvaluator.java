package com.claytonlz.fizzbuzz;

/**
 * Created with IntelliJ IDEA.
 * User: clayton
 * Date: 6/21/12
 * Time: 11:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class FizzBuzzEvaluator {
    private int numberToEvaluate;

    public FizzBuzzEvaluator(int i) {
        this.setNumberToEvaluate(i);
    }

    public String evaluate() {
        int i = this.getNumberToEvaluate();

        if(i % 3 == 0 && i % 5 == 0){
            return "FizzBuzzEvaluator";
        }else if(i == 3 || i % 3 == 0) {
            return "Fizz";
        }else if(i == 5 || i % 5 == 0){
            return "Buzz";
        }
        return String.valueOf(i);
    }

    public int getNumberToEvaluate() {
        return numberToEvaluate;
    }

    public void setNumberToEvaluate(int numberToEvaluate) {
        this.numberToEvaluate = numberToEvaluate;
    }
}
