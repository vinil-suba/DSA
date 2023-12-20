package com.practice.patterns.tableView;

public class DynamicStarsPyramidCombine {

    public static void main(String[] args) {
        /*

         ************
         *****  *****
         ****    ****
         ***      ***
         **        **
         *          *
         *          *
         **        **
         ***      ***
         ****    ****
         *****  *****
         ************

        * */
        printAboveDiagram(7);
    }

    private static void printAboveDiagram(int noOfRowsAndColumns) {
        for (int i = noOfRowsAndColumns; i >= 0; i--) {
            // To print 1st and last index values
            for (int j = 1; j <=i ; j++)
                System.out.print("*");
            // below for loop is for space
            for (int k = 0; k < (noOfRowsAndColumns - i) * 2; k++)
                System.out.print(" ");
            for (int j = i; j >=1 ; j--)
                System.out.print("*");
            System.out.println();
        }

        for (int i = 1; i <= noOfRowsAndColumns; i++) {
            // To print 1st and last index values
            for (int j = 1; j <=i ; j++)
                System.out.print("*");
            // below for loop is for space
            for (int k = 0; k < (noOfRowsAndColumns - i) * 2; k++)
                System.out.print(" ");
            for (int j = i; j >=1 ; j--)
                System.out.print("*");
            System.out.println();
        }
    }
}
