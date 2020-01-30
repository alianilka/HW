
// 3. Write a Java program that takes a year from user and print whether that year is a leap year or not.

import java.util.Scanner;

public class HW33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("If you want to know whether it is a leap year or not, please enter the year : ");
        int year = input.nextInt();

        int remainder = year % 4;

        if (remainder == 0) {
            remainder = year % 100;
            if (remainder == 0) {
                remainder = year % 400;
                if (remainder == 0) {
                    System.out.println("This is a leap year.");
                }else
                    System.out.println("This is not a leap year.");
            }else
                System.out.println("This is a leap year.");
        } else
            System.out.println("This is not a leap year.");
    }
}
