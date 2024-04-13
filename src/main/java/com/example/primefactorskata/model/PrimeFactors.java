package com.example.primefactorskata.model;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> generate(int number) {
        List<Integer> factors = new ArrayList<>();
        if (number == 1) {
            return factors;
        }
        if (number %3 == 0) {
            factors.add(3);
            factors.addAll(generate(number / 3));
            return factors;
        }
        if (number %2 == 0) {
            factors.add(2);
            factors.addAll(generate(number / 2));
            return factors;
        }
        factors.add(number);
        return factors;

    }
}
