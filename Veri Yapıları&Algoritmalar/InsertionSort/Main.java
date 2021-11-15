package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {7, 3, 5, 8, 2, 9, 4, 15, 6};
        System.out.println("Array = "+Arrays.toString(InsertionSort(array)));
    }

    static int[] InsertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int temp = array[i];
            int j = i - 1;
            
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = temp;
        }
        return array;
    }

}

//[7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.
//Adım 1 = [3,7,5,8,2,9,4,15,6]
//Adım 2 = [3,5,7,8,2,9,4,15,6]
//Adım 3 = [3,5,7,2,8,9,4,15,6]
//Adım 4 = [3,5,2,7,8,9,4,15,6]
//Adım 5 = [3,2,5,7,8,9,4,15,6]
//Adım 6 = [2,3,5,7,8,9,4,15,6]
//Time Complexity
//Satır 15,17,18,21,22,24,26 -> 1 işlem * 7  + satır (16,25) & satır (20,23) -> n^2
//Big-O gösterimi -> O(n^2)
// Average case: [7,3,5,8,2,9,4,15,6]
// Worst case: [15,7,8,9,4,6,3,5,2]
// Best case: [2,3,4,5,6,7,8,9,15]
