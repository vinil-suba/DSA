package com.practice.patterns.tableView.triangles.sideTriangles;

public class SideTriangleWithNumbers_1_And_0 {
    public static void main(String[] args) {
        /*

        1
        01
        101
        0101
        10101
        010101

        * */
        printTheAboveNumbersSidePyramidZeroAndOne(6);
    }

    private static void printTheAboveNumbersSidePyramidZeroAndOne(int inputRowsAndColumns) {
        for (int i = 1; i <= inputRowsAndColumns; i++) {
            int printStartValue = (i%2 == 0) ? 0 : 1;
            for (int j = 1; j <= i; j++) {
//                int previousValue = (j%2 == 0) ? 0 : 1;
                System.out.print(printStartValue+ " ");
                printStartValue = 1 - printStartValue;
//                if (printStartValue == 0) {
//                    System.out.print("0 ");
//                } else {
//                    System.out.print("1 ");
//                }
//                previousValue =
            }
            System.out.println();
        }
    }
}
