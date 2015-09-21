package com.twu.exercises.triangleExercises;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class triangleTest {
    private Triangle triangle;

    @Before
    public void setUp() throws Exception {
        triangle = new Triangle();
    }

    @Test
    public void testEasiestExercise() throws Exception {
        assertThat(triangle.execute(), is("*"));
    }

    @Test
    public void testHorizontalLine() throws Exception {
        assertThat(triangle.horizontal(8), is("********"));
    }

    @Test
    public void testVerticalLine() throws Exception {
        assertThat(triangle.vertical(3), is("*\n*\n*\n"));
    }

    @Test
    public void testRightTriangle() throws Exception {
        assertThat(triangle.right(3), is("*\n**\n***\n"));
    }
}