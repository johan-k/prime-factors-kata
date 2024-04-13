package com.example.primefactorskata.model;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    public static List<Integer> generate(int number) {
        if (number != 1) {
            return List.of(number);
        }
        return new ArrayList<>();
    }
}
