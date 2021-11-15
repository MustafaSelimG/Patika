package com.company;

import java.util.Scanner;

public class Sumoffourmultiples {

    public static void main(String[] args) {
        boolean isOdd;
        int number,total=0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter a Number : ");
            number = scanner.nextInt();
            isOdd = number % 2 == 0;

            if ( number % 4 == 0 ){
                total+=number;
            }
        }while (isOdd);

        System.out.println("Summary of the number : "+total);


    }


}
