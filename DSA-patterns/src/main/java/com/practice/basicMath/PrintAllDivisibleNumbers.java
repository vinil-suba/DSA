package com.practice.basicMath;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintAllDivisibleNumbers {
    public static void main(String[] args) {
        // the time complexity is O(n)
        printAllDivisibleNumberOfGivenNumber(36);
        printAllDivisibleNumberOfGivenNumber(25);

        toReduseTimeComplexity(36);
    }

    private static void toReduseTimeComplexity(int input) {
        System.out.println("Performence sake");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= input; i++) {
            if (input % i == 0) {
                list.add(i);
                if(input/i != i)
                    list.add(input/i);
            }
        }
        list.stream()
                .sorted()
                .forEach(num -> System.out.print(num));
    }

    private static void printAllDivisibleNumberOfGivenNumber(int input) {
        System.out.println("Possible divisions : ");
        for (int i = 1; i <= input; i++) {
            if (input % i == 0)
                System.out.print( i + " ");
        }
        System.out.println();
    }
}
