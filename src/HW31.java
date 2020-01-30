import java.util.Scanner;

// 1. Write a program which take four numbers from the user and print out just that few of them which divide by 3 or 5 without remainder

public class HW31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0;
        while (x < 4 ) {
            System.out.println("Please input number: ");
            int number = input.nextInt();

            int remainder1 = number % 3;
            int remainder2 = number % 5;
            x = x + 1;
            if ((remainder1 == 0) || (remainder2 == 0)) {
                System.out.println(number);

                //System.out.println("\nRemainder for 3: " + remainder1);
                //System.out.println("Remainder for 5: " + remainder2);
            }
        }
    }
}
