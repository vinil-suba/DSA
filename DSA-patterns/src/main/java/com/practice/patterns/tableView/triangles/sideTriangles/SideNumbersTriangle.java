package com.practice.patterns.tableView.triangles.sideTriangles;

public class SideNumbersTriangle {
    public static void main(String[] args) {
        /*

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        1 2 3 4 5 6

        * */
        printTheAbovepyramid(6);
    }

    private static void printTheAbovepyramid(int noOfRowsAndColumns) {
        for (int i = 1; i <= noOfRowsAndColumns; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
