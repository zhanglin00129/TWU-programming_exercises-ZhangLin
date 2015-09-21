package com.twu.exercises.triangleExercises;

public class Triangle {
    public String execute() {
        return "*";
    }

    public String horizontal(int num) {
        String result = "";
        for (int j = 0; j < num; j++) {
            result += "*";
        }
        return result;
    }
}
