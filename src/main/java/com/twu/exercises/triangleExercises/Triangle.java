package com.twu.exercises.triangleExercises;

import org.apache.commons.lang3.StringUtils;

public class Triangle {
    public String execute() {
        return "*";
    }

    public String horizontal(int num) {
        return StringUtils.repeat("*", num);
    }

    public String vertical(int num) {
        return StringUtils.repeat("*\n", num);
    }

    public String right(int num) {
        String result = "";
        for (int i = 1; i <= num; i++) {
            result += StringUtils.repeat("*", i);
            result += "\n";
        }
        return result;

    }
}
