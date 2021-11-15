    package com.company;

    import java.util.Arrays;
    import java.util.Scanner;

    public class PalindromNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();

            if (Palindrom(number)) System.out.println("Palindrom number");
            else if (!Palindrom(number)) System.out.println("Not a Palindrom number");
        }
    
            static boolean Palindrom(int number){
            char[] A = String.valueOf(number).toCharArray();
            int length = A.length;
            char[] B = new char[length];
                for (int i = 0; i < length; i++) {
                    B[length-i-1]=A[i];
                }
            return Arrays.equals(A,B);
            }
    
    }
        
