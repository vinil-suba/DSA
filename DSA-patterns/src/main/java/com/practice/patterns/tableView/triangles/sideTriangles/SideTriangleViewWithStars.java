package com.practice.patterns.tableView.triangles.sideTriangles;

public class SideTriangleViewWithStars {
    public static void main(String[] args) {
        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *

        */
        printAboveTriangle(10);
    }

    public static void printAboveTriangle(int noOfRowsAndColumns) {
        for (int i = 0; i <= noOfRowsAndColumns; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
