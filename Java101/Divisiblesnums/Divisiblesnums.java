package com.company;

import java.util.Scanner;

public class Divisiblesnums {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int number = scanner.nextInt();

        System.out.println("Average is : "+Divisibles(number));

    }

    public static int Divisibles(int number){
        int count=0,total=0;

        for (int i = 1; i < number; i++) {

            if ( i % 3 == 0 && i % 4 == 0){
                total+=i;
                count=count+1;
            }
        }

        return total/count;
    }

}
