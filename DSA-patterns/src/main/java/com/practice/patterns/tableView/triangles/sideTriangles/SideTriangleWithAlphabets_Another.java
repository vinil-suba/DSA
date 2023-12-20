package com.practice.patterns.tableView.triangles.sideTriangles;

public class SideTriangleWithAlphabets_Another {
    public static void main(String[] args) {
        /*

        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F

        * */
        printThePyramid(5);
    }

    private static void printThePyramid(int noOfRows) {
        for (int i = 0; i < noOfRows; i++) {
            char remember = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print((char)((int)('A'+i)) + " ");
//                remember = j;
            }
            System.out.println();
        }
    }
}
