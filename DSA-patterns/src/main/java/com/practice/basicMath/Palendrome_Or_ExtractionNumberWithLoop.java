package com.practice.basicMath;

public class Palendrome_Or_ExtractionNumberWithLoop {
    public static void main(String[] args) {
//        extractTheNumber(523);
        extractTheNumber(121);
    }

    private static void extractTheNumber(int number) {
        int givenValue = number;
        int reverseNumber =0;

        while (number > 0) {
            int eachNumber = number % 10;
            reverseNumber = (reverseNumber * 10) + eachNumber;
            number = number / 10;
//            number = remainingNumber;
            System.out.println("given number "+ givenValue+ " each number : "+ eachNumber +
                    " updated number"+number+ "reverse number: "+reverseNumber );
        }
        if (reverseNumber == givenValue)
            System.out.println(" Given Number is Palendrome");
        else
            System.out.println("Given number is not a palendrom");
    }
}
