package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ZodiacSign {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your Birth Month : ");
            int month = scanner.nextInt();
            System.out.print("Enter your Birth Day : ");
            int day = scanner.nextInt();


            if ( month == 1){
                if ( 22 <= day && day <= 31){
                    System.out.println("Your Zodiac Sign is ♒ Aquarius ");
                }
                if ( 1 <= day && day <= 21){
                    System.out.println("Your Zodiac Sign is ♑ Capricornus ");
                }
            }


            if ( month == 2){
                if ( 20 <= day && day <= 29){
                    System.out.println("Your Zodiac Sign is ♓ Pisces ");
                }
                if ( 1 <= day && day <= 19){
                    System.out.println("Your Zodiac Sign is ♒ Aquarius ");
                }
            }

            if ( month == 3){
                if ( 21 <= day && day <= 31){
                    System.out.println("Your Zodiac Sign is ♈ Aries ");
                }
                if ( 1 <= day && day <= 20){
                    System.out.println("Your Zodiac Sign is ♓ Pisces ");
                }
            }

            if ( month == 4){
                if ( 21 <= day && day <= 30){
                    System.out.println("Your Zodiac Sign is ♉ Taurus ");
                }
                if ( 1 <= day && day <= 20){
                    System.out.println("Your Zodiac Sign is ♈ Aries ");
                }
            }

            if ( month == 5){
                if ( 22 <= day && day <= 31){
                    System.out.println("Your Zodiac Sign is ♊ Gemini ");
                }
                if ( 1 <= day && day <= 21){
                    System.out.println("Your Zodiac Sign is ♉ Taurus ");
                }
            }

            if ( month == 6){
                if ( 23 <= day && day <= 30){
                    System.out.println("Your Zodiac Sign is ♋ Cancer ");
                }
                if ( 1 <= day && day <= 22){
                    System.out.println("Your Zodiac Sign is ♊ Gemini ");
                }
            }

            if ( month == 7){
                if ( 23 <= day && day <= 31){
                    System.out.println("Your Zodiac Sign is ♌ Leo ");
                }
                if ( 1 <= day && day <= 22){
                    System.out.println("Your Zodiac Sign is ♋ Cancer ");
                }
            }

            if ( month == 8){
                if ( 23 <= day && day <= 30){
                    System.out.println("Your Zodiac Sign is ♍ Virgo ");
                }
                if ( 1 <= day && day <= 22){
                    System.out.println("Your Zodiac Sign is ♌ Leo ");
                }
            }

            if ( month == 9){
                if ( 23 <= day && day <= 31){
                    System.out.println("Your Zodiac Sign is ♎ Libra ");
                }
                if ( 1 <= day && day <= 22){
                    System.out.println("Your Zodiac Sign is ♍ Virgo ");
                }
            }

            if ( month == 10){
                if ( 23 <= day && day <= 30){
                    System.out.println("Your Zodiac Sign is ♏ Scorpius ");
                }
                if ( 1 <= day && day <= 22){
                    System.out.println("Your Zodiac Sign is ♎ Libra ");
                }
            }

            if ( month == 11){
                if ( 22 <= day && day <= 31){
                    System.out.println("Your Zodiac Sign is ♐ Sagittarius ");
                }
                if ( 1 <= day && day <= 21){
                    System.out.println("Your Zodiac Sign is ♏ Scorpius ");
                }
            }

            if ( month == 12){
                if ( 22 <= day && day <= 30){
                    System.out.println("Your Zodiac Sign is ♑ Capricornus ");
                }
                if ( 1 <= day && day <= 21){
                    System.out.println("Your Zodiac Sign is ♐ Sagittarius ");
                }
            }

            else {
                System.out.println("Invalid Input!");
            }

        }catch (InputMismatchException e){
            System.out.println("Invalid Input!");
        }



    }

}
