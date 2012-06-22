package com.claytonlz.fizzbuzz;

/**
 * Created with IntelliJ IDEA.
 * User: clayton
 * Date: 6/21/12
 * Time: 11:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class FizzBuzz {

    public String evaluate(int i) {
        if(i % 3 == 0 && i % 5 == 0){
            return "FizzBuzz";
        }else if(i == 3 || i % 3 == 0) {
            return "Fizz";
        }else if(i == 5 || i % 5 == 0){
            return "Buzz";
        }
        return String.valueOf(i);
    }

    public void run() {
        evaluate(10);
    }
}
