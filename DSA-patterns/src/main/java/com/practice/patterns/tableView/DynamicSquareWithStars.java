package com.practice.patterns.tableView;

public class DynamicSquareWithStars {

    public static void main(String[] args) {

    /*

     * * * * * *
     * * * * * *
     * * * * * *
     * * * * * *
     * * * * * *
     * * * * * *

     */
    printTraiangleBasedOnUserInput(10);
}

    private static void printTraiangleBasedOnUserInput(int noOfRowsAndColumns) {
        for (int i = 0; i <= noOfRowsAndColumns; i++) {
            for (int j = 0; j <= noOfRowsAndColumns; j++)
                System.out.print("*");
            System.out.println(" ");
        }
    }
}
