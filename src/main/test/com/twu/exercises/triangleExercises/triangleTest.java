package com.twu.exercises.triangleExercises;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class triangleTest {
    private Triangle triangle;

    @Test
    public void testEasiestExercise() throws Exception {
        assertThat(triangle.execute(), is("*"));
    }
}