package com.example.primefactorskata.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.util.Lists.list;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeFactorsTest {

    @Test
    public void testOne() {
        assertEquals(list(), PrimeFactors.generate(1));
    }
}
