package com.practice.patterns.tableView.triangles.sideTriangles;

public class SideTriangleWithAlphabets {
    public static void main(String[] args) {
        /*
        
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        
        * */
        printTheAboveAlphabetPyramid(10);
    }

    private static void printTheAboveAlphabetPyramid(int noOfRowsAndColumns) {
        // this loop is for no of rows
        for (int i = 0; i < noOfRowsAndColumns; i++) {
            // we have to iterate the chars because we have to
            // print the values based on alphabets
            // as per ASCII values the Big alphabets are starts with 65
            // we are incrementing them by one at every case.
            for (char ch= 'A'; ch <='A'+i ; ch++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
