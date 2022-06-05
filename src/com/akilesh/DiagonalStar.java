package com.akilesh;

public class DiagonalStar {

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            // i is row and j is column
            for (int i = 1; i <= number; i++ ) {
                for (int j = 1; j <= number; j++) {
                    // This if statement prints all the border things.
                    if ((i == 1) || (i == number) || (j == 1) || (j == number)) {
                        System.out.print("*");
                    } else if (i == j){
                        System.out.print("*");
                    } else if (j == (number - i + 1)){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
