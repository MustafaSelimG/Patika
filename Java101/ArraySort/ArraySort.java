package com.company;

import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Array Length : ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print((i+1) +". value = ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                int tmp;
                if (array[i] > array[j])
                {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }

            System.out.print(array[i]+" ");
        }
    }
}