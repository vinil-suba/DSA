package com.practice.basicMath;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Qubing each number ==> sum each number after qubing ==>
        // check the given number == sum of qubes of each number
        checkGivenNumberIsArmstrongOrNot(371);
        checkGivenNumberIsArmstrongOrNot(1634);
    }

    private static void checkGivenNumberIsArmstrongOrNot(int number) {
        int temp = number;
        int sum = 0;
        while (number > 0) {
            int eachNumber = number % 10;
            sum = sum + (eachNumber * eachNumber * eachNumber);
            number = number / 10;
        }
        if (temp == sum)
            System.out.println(" Given Number is armstrong");
        else
            System.out.println("Given Number is not a armstrong number");

    }
}
