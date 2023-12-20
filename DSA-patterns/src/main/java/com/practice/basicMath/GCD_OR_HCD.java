package com.practice.basicMath;

public class GCD_OR_HCD {
    public static void main(String[] args) {
        // GCD --> Greatest common division
        // HCD --> The Highest common Division
        getTheGCDvalue(10, 15);
    }

    private static void getTheGCDvalue(int value1, int value2) {
//        int minValue = Math.min(value1, value2);
//        int gcd = 1;
//        for (int i = 1; i <= minValue; i++) {
//            if(value1 % i == 0 && value2 % i == 0)
//                gcd = i;
//                System.out.println( gcd);;
//            break;
//        }
        while (value1 > 0 && value2 > 0) {
            if (value1 > value2)
                value1 = value1 % value2;
            else
                value2 = value2 % value1;
        }

        if(value1 == 0)
            System.out.println("The GCD is : "+ value2);
        return;
    }
}
