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

    public String vertical(int num) {
        String result = "";
        for (int j = 0; j < num; j++) {
            result += "*\n";
        }
        return result;
    }

    public String right(int num) {
        String result = "";
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                result += "*";
            }
            result += "\n";
        }
        return result;

    }
}
