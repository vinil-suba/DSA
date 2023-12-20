package com.practice.patterns.tableView;

public class DynamicTraiangleFlipAndDown {
    /*

     *          *
     **        **
     ***      ***
     ****    ****
     *****  *****
     ************
     *****  *****
     ****    ****
     ***      ***
     **        **
     *          *

    * */
    public static void main(String[] args) {
        printTriangle(5);
    }

    private static void printTriangle(int noOfRows) {
        for (int i = 1; i <= noOfRows; i++) {
            // To print 1st and last index values
            for (int j = 1; j <=i ; j++)
                System.out.print("*");
            // below for loop is for space
            for (int k = 0; k < (noOfRows - i) * 2; k++)
                System.out.print(" ");
            for (int j = i; j >=1 ; j--)
                System.out.print("*");
            System.out.println();
        }
        for (int i = noOfRows -1; i >= 1; i--) {
            // To print 1st and last index values
            for (int j = 1; j <=i ; j++)
                System.out.print("*");
            // below for loop is for space
            for (int k = 0; k < (noOfRows - i) * 2; k++)
                System.out.print(" ");
            for (int j = i; j >=1 ; j--)
                System.out.print("*");
            System.out.println();
        }
    }
}
