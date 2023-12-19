package com.practice.patterns.tableView.triangles.sideTriangles;

public class SideTriangleFlipWithNumbers {
    public static void main(String[] args) {
    /*
        1 2 3 4 5 6
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1

    * */
        drawTheAboveTriangleFlip(5);
    }

    private static void drawTheAboveTriangleFlip(int noOfRowsAndColumns) {
        for (int i = noOfRowsAndColumns; i >= 0 ; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print(j +" ");
            System.out.println();
        }
    }
}
