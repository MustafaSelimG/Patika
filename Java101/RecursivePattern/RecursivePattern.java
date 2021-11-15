package com.company;

import java.util.Scanner;

public class RecursivePattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number : ");
        int number = scanner.nextInt();
        int num2=number;
        boolean reverse=false;
        Pattern(number,num2,reverse);
        
    }

    static boolean Pattern(int number,int num2,boolean reverse){
        if (number<=0){
            number+=5;
            reverse=true;
            Pattern(number,num2,reverse);
        }
        else if(number>0 && !reverse && num2>=number){
            number-=5;
            System.out.print(number+" ");
            Pattern(number,num2,reverse);
        }
        else if(number>0 && reverse && num2>number){
            number+=5;
            System.out.print(number+" ");
            Pattern(number,num2,reverse);
        }
        return true;
    }


}
