package com.twu.exercises;

public class FizzBuzz {

    public String execute(int num) {
        String result = "";
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0)
                    result += "FizzBuzz\n";
                else
                    result += "Fizz\n";
            } else if (i % 5 == 0) {
                result += "Buzz\n";
            } else {
                result += i+"\n";
            }
        }
        return result;
    }
}
