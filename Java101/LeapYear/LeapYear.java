package com.company;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Year : ");
        int year = scanner.nextInt();

        int rest = year % 4;

        boolean isLeapYear = rest == 0;

        System.out.println(isLeapYear? year+" is a Leap year" : year+" is not a Leap year");

    }
}
