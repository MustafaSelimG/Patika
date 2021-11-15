package com.company;

import java.util.Arrays;

public class ArrayRepetitiveEven {
    public static void main(String[] args) {

        int[] array = { 1, 2, 4, 5, 5, 6, 6, 3, 4, 5, 13, 4, 7, 8};
        int[] duplicate = new int[array.length];
        int index=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ( i != j && array[i]==array[j] && array[i]%2==0){
                    duplicate[index++]=array[i];
                }
            }
        }

        System.out.println(Arrays.toString(duplicate));
    }
}