package com.example.primefactorskata.model;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> generate(int number) {
        List<Integer> factors = new ArrayList<>();
        if (number == 1) {
            return factors;
        }
        for (int i = 2; i < (number/2)+1; i++) {
            if (number % i == 0) {
                factors.add(i);
                factors.addAll(generate(number / i));
                return factors;
            }
        }
        factors.add(number);
        return factors;

    }
}
