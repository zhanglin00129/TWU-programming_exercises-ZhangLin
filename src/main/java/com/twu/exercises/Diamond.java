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

    public String rhombus(int num) {
        String result = isosceles(num);
        for (int i = num; i < 2 * num - 1; i++) {
            result += StringUtils.repeat(" ", (1 + i - num));
            result += StringUtils.repeat("*", (4 * num - 2 * i - 3));
            result += "\n";
        }
        return result;
    }
}
