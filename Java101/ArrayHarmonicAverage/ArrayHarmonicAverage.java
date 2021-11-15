package com.company;

public class ArrayHarmonicAverage {
    public static void main(String[] args) {
        double[] numbers = {12, 13, 14, 15, 16};
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += 1/numbers[i];
        }

        System.out.println(sum / numbers.length);
    }
}
