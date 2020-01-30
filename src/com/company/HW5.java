package com.company;

//5. Write a program which converts number from decimal to hex view (input in command line)
//    // Enter a decimal number: 1234
//    // Decimal to complex: 4d2

import java.util.Scanner;

public class HW5 {
    static public void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int i = input.nextInt();
        String hexI = Integer.toHexString(i);
        System.out.println("Decimal to complex: " + hexI);
    }
}