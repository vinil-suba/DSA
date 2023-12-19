package com.practice.patterns.tableView.triangles;

public class DynamicTriangle {
    public static void main(String[] args) {
        /*

              *
             ***
            *****
           *******
          *********
         ***********

        * */
        drawTheAboveDynamicTriangle(10);
    }

    public static void drawTheAboveDynamicTriangle(int noOfRowsAndColumns) {
        // 1. write a logic to reduce the space then print a star
        for (int i = 1; i <= noOfRowsAndColumns; i++) {
            // below loop is for space
            for (int j = 1; j <= (noOfRowsAndColumns - i) ; j++)
                System.out.print(" ");
            // below loop is for triangle
            // in above every column has to increase by 2 stars
            for (int k = 1; k <= (i - 1) *2 +1; k++)
                System.out.print("*");
            // below loop is for right side triangle
//            for (int l = 1; l < i; l++)
//                System.out.print("*"); 4, 3, 2, 1
            for (int m = 1; m <= (noOfRowsAndColumns - i); m++)
                System.out.print(" ");
            System.out.println();
        }
    }
}
