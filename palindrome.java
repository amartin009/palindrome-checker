/*
AUTHOR: Audra Martin (GitHub: @amartin009)
DATE: 01.08.2020
DESCRIPTION: This is a program to determine if a string given from a user is a valid palindrome.
             Note: Palindromes are words that are spelt the same forward and backward.
             Example: "KAYAK" is a valid palindrome.
*/

import java.util.Scanner;
import java.lang.StringBuilder;


public class palindrome {

    public static void main(String [] args) {
        String input;

        System.out.println("Welcome to the Palindrome Checker.");
        System.out.println("Please enter a string.");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        char[] chArr1 = input.toCharArray();
        for (int i = 0; i < input.length(); i++) {
            chArr1[i] = input.charAt(i);
        }
        for (char ch : chArr1) {
            System.out.println(ch);
        }
        StringBuilder reverse = new StringBuilder();
        for (int i = chArr1.length - 1; i >= 0; i--) {
            reverse.append(chArr1[i]);
        }
        if (reverse.toString().equals(input)) {
            System.out.println();
            System.out.println("The string is a valid palindrome.");
        } else {
            System.out.println();
            System.out.println("The string is not a valid palindrome.");
        }
    }
}
