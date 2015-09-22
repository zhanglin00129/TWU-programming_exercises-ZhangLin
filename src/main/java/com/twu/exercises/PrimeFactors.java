package com.twu.exercises;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List execute(int num) {
        List result = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                result.add(i);
                num = num / i;
            }
        }
        return result;
    }
}

