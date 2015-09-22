package com.twu.exercises;

import org.apache.commons.lang3.StringUtils;

public class Diamond {
    public String isosceles(int num) {
        String result = "";

        for (int i = 0; i < num; i++) {
            result += StringUtils.repeat(" ", (num - i - 1));
            result += StringUtils.repeat("*", (2 * i + 1));
            result += "\n";
        }
        return result;
    }
}
