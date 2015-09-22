package com.twu.exercises;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PrimeFactorsTest {
    private PrimeFactors primeFactors;

    @Before
    public void setUp() throws Exception {
        primeFactors = new PrimeFactors();
    }

    @Test
    public void testPrimeFactors() throws Exception {
        List expect = new ArrayList<>();
        expect.add(2);
        expect.add(3);
        expect.add(5);
        assertThat(primeFactors.execute(30), is(expect));
    }
}