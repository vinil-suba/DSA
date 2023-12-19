package com.practice.patterns.tableView.triangles.sideTriangles;

public class SideTriangleWithIncrementNumbers {
    public static void main(String[] args) {
        /*

        1
        2  3
        4  5  6
        7  8  9  10
        11  12  13  14  15
        16  17  18  19  20  21

        * */
        drawTheAboveDynamicIncrementNumberPyramid(6);
    }

    private static void drawTheAboveDynamicIncrementNumberPyramid(int noOfRowsAndColumns) {
        int incrementValue = 1;
        for (int i = 1; i <= noOfRowsAndColumns; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(incrementValue+ " ");
                incrementValue = incrementValue + 1;
            }
            System.out.println();
        }
    }
}
