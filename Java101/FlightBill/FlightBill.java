package com.company;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FlightBill {

    private static final DecimalFormat dfZero = new DecimalFormat("0.00");

    public static void main(String[] args) {

        int customerAge,typeOfTrip;
        double distance,totalPrice;

        Scanner scanner = new Scanner(System.in);

        try{

            System.out.print("Please Enter the Kilometer : ");
            distance = scanner.nextDouble();

            System.out.print("Please Enter Your Age : ");
            customerAge = scanner.nextInt();

            System.out.print("Type of Trip : (1) One way / (2) Return => ");
            typeOfTrip = scanner.nextInt();

            totalPrice = 0.1 * distance;

            if ( (typeOfTrip != 1 && typeOfTrip != 2) || (distance < 0) || (customerAge < 0) ){
                System.out.println("Invalid Input!");
            }

            else {
                getTotalPrice(typeOfTrip,ageDiscount(customerAge,totalPrice));
            }



        }
        catch (InputMismatchException e){
            System.out.println("Invalid Input!");
        }
    }

    public static double ageDiscount(int customerAge,double totalPrice){

        if ( customerAge <= 12 ){
            totalPrice = totalPrice / 2;
        }

        else if ( customerAge > 12 && customerAge < 24 ){
            totalPrice = 0.9 * totalPrice;
        }

        else if ( customerAge > 65 ){
            totalPrice = 0.7 * totalPrice;
        }

        return totalPrice;
    }


    public static void getTotalPrice(int typeOfTrip,double Price){

        if ( typeOfTrip == 2 ){
            Price = 2 * (0.8 * Price);
            System.out.println("Total Price is "+dfZero.format(Price)+" TL.");
        }
        else if( typeOfTrip == 1 ){
            System.out.println("Total Price is "+dfZero.format(Price)+" TL.");
        }

    }
}
