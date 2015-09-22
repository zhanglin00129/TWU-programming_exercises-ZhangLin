package com.twu.exercises;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DiamondTest {
    private Diamond diamond;

    @Before
    public void setUp() throws Exception {
        diamond = new Diamond();

    }

    @Test
    public void testIsoscelesTriangle() throws Exception {
        String expect = "  *\n ***\n*****\n";
        assertThat(diamond.isosceles(3), is(expect));
    }

    @Test
    public void testDiamond() throws Exception {
        String expect = "  *\n ***\n*****\n ***\n  *\n";
        assertThat(diamond.rhombus(3), is(expect));
    }

    @Test
    public void testDiamendWithName() throws Exception {
        String expect = "  *\n ***\nLin\n ***\n  *\n";
        assertThat(diamond.rhombusName(3), is(expect));
    }
}