package com.practice.patterns.tableView.triangles.sideTriangles;

public class SideNumbersTrianglePart2 {
    public static void main(String[] args) {
        /*

        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5
        6 6 6 6 6 6

        * */
        printTheAbovePyramid(6);
    }

    private static void printTheAbovePyramid(int noOfRowsAndColumns) {
        for (int i = 1; i <= noOfRowsAndColumns; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(i +" ");
            System.out.println();
        }
    }
}
