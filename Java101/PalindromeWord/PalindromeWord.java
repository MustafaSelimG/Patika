package com.company;
import java.util.Scanner;

public class PalindromeWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String word = scanner.next();
        word = word.toLowerCase();
        char[] str = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            str[i] = word.charAt(word.length()-i-1);
        }

        String reverse = String.valueOf(str);

        if( reverse.equals(word)){
            System.out.println("It is a Palindrome word => "+ word + " / " + reverse);
        }
        else if ( !reverse.equals(word)){
            System.out.println("It is not a Palindrome word => " +word + " / " + reverse);
        }
    }
}