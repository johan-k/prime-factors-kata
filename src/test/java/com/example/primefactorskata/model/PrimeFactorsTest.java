package com.example.primefactorskata.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.util.Lists.list;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorsTest {

    @Test
    public void testOne() {
        assertEquals(list(), PrimeFactors.generate(1));
    }
    @Test
    public void testTwo() {
        assertEquals(list(2), PrimeFactors.generate(2));
    }

    @Test
    public void testThree() {
        assertEquals(list(3), PrimeFactors.generate(3));
    }

    @Test
    public void testFour() {
        assertEquals(list(2,2), PrimeFactors.generate(4));
    }
}
