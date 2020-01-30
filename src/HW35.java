//5. Write the program which take name of color from user
// (red, blue, green, yellow, orange, black, white, pink) and print out length of this word. Use switch

import java.util.Scanner;

public class HW35 {
    public static void main(String[] args) {
        System.out.println("Please, enter the name of color:");
        Scanner input = new Scanner(System.in);
        String indexColor = input.nextLine();
        switch (indexColor){
            case "red":
            case "blue":
            case "green":
            case "yellow":
            case "orange":
            case "black":
            case "white":
            case "pink":
                System.out.println("The length of this word is " + indexColor.length());
                break;
            default:
                System.out.println("Sorry, there is no such color in our library.");
        }
    }
}
