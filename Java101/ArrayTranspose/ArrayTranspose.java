package com.company;

import java.util.Arrays;

public class ArrayTranspose {
    public static void main(String[] args) {

        int[][] array = { {1,2,3,4},{5,6,7,8},{9,10,11,12} };
        int row = array.length;
        int col = array[0].length;
        int[][] transpose = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i]=array[i][j];
            }
        }
        for (int i = 0; i < col; i++) {
            System.out.println(Arrays.toString(transpose[i]));
        }
        System.out.println();
        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

    }
}