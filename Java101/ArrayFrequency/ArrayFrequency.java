package com.company;


import java.util.Scanner;

public class Array Frequency {
    public static void main(String[] args) {
        int tmp=-1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Array Length : ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        int[] freq = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print(i+". value of Array : ");
            array[i]=scanner.nextInt();
        }


        for (int i = 0; i < array.length; i++) {
            int times=1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i]==array[j]){
                    times++;
                    freq[j]=tmp;
                }
            }
            if (freq[i] != tmp){
                freq[i]=times;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (freq[i] != tmp){
                System.out.println(array[i] + " repeated "+ freq[i] + " times.");
            }
        }
    }
}