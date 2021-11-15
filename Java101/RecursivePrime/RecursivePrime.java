package com.company;

import java.util.Scanner;

public class RecursivePrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number : ");
        int number = scanner.nextInt();

        if (Prime(number,2)==0) System.out.println("Prime Number");
        else if (Prime(number,2)==1) System.out.println("Not a Prime Number");

    }

    static int Prime(int number,int i){
        if (number==i) return 0;
        else if (number%i==0) return 1;
        else return Prime(number,i+1);
    }


}
