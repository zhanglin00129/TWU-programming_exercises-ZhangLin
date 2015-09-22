package com.twu.exercises;

import org.apache.commons.lang3.StringUtils;

public class Diamond {

    public static final String MY_NAME = "Lin\n";

    private String upTriangle(int num) {
        String result = "";
        for (int i = 0; i < num - 1; i++) {
            result += StringUtils.repeat(" ", (num - i - 1));
            result += StringUtils.repeat("*", (2 * i + 1));
            result += "\n";
        }
        return result;
    }

    private String downTriangle(int num) {
        String result = "";
        for (int i = num; i < 2 * num - 1; i++) {
            result += StringUtils.repeat(" ", (1 + i - num));
            result += StringUtils.repeat("*", (4 * num - 2 * i - 3));
            result += "\n";
        }
        return result;
    }

    public String isosceles(int num) {
        return upTriangle(num) +
                StringUtils.repeat("*", (2 * num - 1)) +
                "\n";
    }

    public String rhombus(int num) {
        return isosceles(num) + downTriangle(num);
    }

    public String rhombusName(int num) {
        return upTriangle(num) + MY_NAME + downTriangle(num);
    }
}
