package com.practice.patterns.tableView;

public class DynamicNumbersPyramid {
    public static void main(String[] args) {
        /*
        
        1          1
        12        21
        123      321
        1234    4321
        12345  54321
        123456654321
        
        * */
        printAboveDiagram(7);
    }

    private static void printAboveDiagram(int noOfRowsAndColumns) {
        for (int i = 1; i <= noOfRowsAndColumns; i++) {
            // To print 1st and last index values
            for (int j = 1; j <=i ; j++)
                System.out.print(j);
            // below for loop is for space
            for (int k = 0; k < (noOfRowsAndColumns - i) * 2; k++)
                System.out.print(" ");
            for (int j = i; j >=1 ; j--)
                System.out.print(j);
            System.out.println();
        }
    }
}
