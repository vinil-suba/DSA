package com.practice.basicMath;

public class PrimeNumber {
    public static void main(String[] args) {
        // The time complexity is O(n)
//        findThePrimeNumner(10);
//        findThePrimeNumner(231);
        // to improve time complexity
        improvePrimeCheck(10);

    }

    private static void improvePrimeCheck(int inp) {
        int count = 0;
        for (int i = 1; i * i <= inp; i++) {
            if (inp % i == 0) {
                count ++;
                if(inp/i != i)
                    count ++;
            }
        }
        if(count == 2)
            System.out.println("Given Number is a Prime");
        else
            System.out.println("Given Number is not a prime Number");

    }

    private static void findThePrimeNumner(int input) {
        if (input % 2 !=0 && input != 1)
            System.out.println("Given Number Is Prime : " + input);
        else
            System.out.println("Given Number is Not a prime Number : " + input);
    }
}
