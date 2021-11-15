package com.company;

import java.util.Scanner;

public class Powers {

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a Number : ");
        number = scanner.nextInt();

        System.out.print("Powers of 4 => ");
        for (int i = 4; i < number; i*=4) {
            System.out.print(i+" ");
        }

        System.out.println("");

        System.out.print("Powers of 5 => ");
        for (int j = 5; j < number; j*=5) {
            System.out.print(j+" ");
        }


    }
}
