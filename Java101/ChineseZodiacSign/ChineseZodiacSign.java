package com.company;

import java.util.Scanner;

public class ChineseZodiacSign {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Your Birth Year : ");
            int year = scanner.nextInt();

            System.out.println("Your Chinese Zodiac Sign is => " + ChineseZodiac(year));
        }
        catch (Exception e){
            System.out.println("Invalid Input");
        }

    }

    public static String ChineseZodiac ( int year ){
        String sign="";
        int rest = year % 12;


        switch (rest){
            case 0:
                sign = "Monkey";
                break;

            case 1:
                sign = "Rooster";
                break;

            case 2:
                sign = "Dog";
                break;

            case 3:
                sign = "Pig";
                break;

            case 4:
                sign = "Mouse";
                break;

            case 5:
                sign = "Ox";
                break;

            case 6:
                sign = "Tiger";
                break;

            case 7:
                sign = "Rabbit";
                break;

            case 8:
                sign = "Dragon";
                break;

            case 9:
                sign = "Snake";
                break;

            case 10:
                sign = "Horse";
                break;

            case 11:
                sign = "Ship";
                break;

        }

        return sign;
    }
}
