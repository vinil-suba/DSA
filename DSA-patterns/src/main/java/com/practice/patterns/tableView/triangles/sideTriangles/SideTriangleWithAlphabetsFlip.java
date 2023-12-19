package com.practice.patterns.tableView.triangles.sideTriangles;

public class SideTriangleWithAlphabetsFlip {
    /*

    A B C D E F
    A B C D E
    A B C D
    A B C
    A B
    A

    * */
    public static void main(String[] args) {
        drawTheSideTriangleWithAlphabetsFlip(5);
    }

    private static void drawTheSideTriangleWithAlphabetsFlip(int noOfRows) {
        for (int i = 1; i <= noOfRows; i++) {
            for (char j = 'A'; j <= 'A' + (noOfRows- i); j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
