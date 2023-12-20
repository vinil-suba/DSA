package com.practice.basicMath;

import static java.lang.Math.log10;

public class ExtractionNumberByLog {
    public static void main(String[] args) {
        int value = 234;
        int digits = (int)log10(value) + 1;
        System.out.println(digits);
        // The time complexity is O(log10(n)) --> because we are dividing the values by 10 for n times.
        // if the division value changes, the log base value will also change.
    }
}
