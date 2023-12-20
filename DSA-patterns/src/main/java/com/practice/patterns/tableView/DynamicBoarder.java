package com.practice.patterns.tableView;

public class DynamicBoarder {
    public static void main(String[] args) {
        printDynamicBoarder(10);
    }

    private static void printDynamicBoarder(int noOfRows) {
        for (int i = 1; i <= noOfRows; i++) {
            for (int j = 1; j <= noOfRows; j++) {
                if(i == 1 || i == noOfRows || j == 1 || j == noOfRows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
