package com.practice.patterns.tableView.triangles;

public class DynamicDymond_AttachBothPyramids {
    public static void main(String[] args) {
        /*

              *
             ***
            *****
           *******
          *********
         ***********
         ***********
          *********
           *******
            *****
             ***
              *

        * */
        printTheAboveDymond(5);
    }

    private static void printTheAboveDymond(int noOfRowsAndColumns) {
        DynamicTriangle.drawTheAboveDynamicTriangle(5);
        DynamicTriangleFlip.printTheAboveDynamicTriangleFlip(5);
    }

}
