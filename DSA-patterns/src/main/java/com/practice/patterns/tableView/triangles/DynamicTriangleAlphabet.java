package com.practice.patterns.tableView.triangles;

public class DynamicTriangleAlphabet {
    public static void main(String[] args) {
        /*

                 A
                ABA
               ABCBA
              ABCDCBA
             ABCDEDCBA
            ABCDEFEDCBA

        * */
        // Not working as excepted. have to fix it
        printAbove(5);
    }

    private static void printAbove(int noOfRows) {
        for (int i = 1; i <= noOfRows; i++) {
            for (int j = 1; j <= noOfRows - i ; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for (int j = 1; j <= i*2 -1 ; j++) {
                System.out.print(ch);
                if(j <= breakpoint) ch++;
                else ch--;
            }
            for (int j = 1; j <= noOfRows - i -1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
