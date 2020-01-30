//4. Write a program which take number of month from user and print out name of season (summer, winter ...)

import java.util.Scanner;

public class HW34 {
    public static void main(String[] args) {
        System.out.print("Please, enter the number of the month:");
        Scanner input = new Scanner(System.in);
        int indexMonth = input.nextInt();
        switch (indexMonth) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Year has only 12 months.");
        }
    }
}
