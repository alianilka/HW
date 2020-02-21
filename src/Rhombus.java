import sun.tools.jconsole.JConsole;

import java.util.Arrays;
import java.util.Scanner;

public class Rhombus {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scan.nextInt();
        for (int i = rows; i > 0; i--) {
            if (i == rows) {
                for (int j = 0; j < i * 2; j++)
                    System.out.print("#");
            } else {
                for (int k = 0; k < i; k++)
                    System.out.print("#");
                for (int l = 0; l < rows - i; l++) {
                    System.out.print(' ');
                }
                for (int l = 0; l < rows - i; l++) {
                    System.out.print(' ');
                }
                for (int m = 0; m < i; m++)
                    System.out.print("#");
            }
            System.out.println();
//            Arrays.fill();
        }

        for (int i = 2; i <= rows; i++){
            if (i == rows) {
                for (int j = 0; j < i * 2; j++)
                    System.out.print('#');
            } else {
                for (int k = 0; k < i; k++)
                    System.out.print("#");
                for (int l = 0; l < rows - i; l++) {
                    System.out.print(' ');
                }
                for (int l = 0; l < rows - i; l++) {
                    System.out.print(' ');
                }
                for (int m = 0; m < i; m++)
                    System.out.print("#");
            }
            System.out.println();
//            Arrays.fill();
        }
//        i = 1;
////print upper triangle
//        while (i <= rows) {
//            j = rows;
//            while (j > i) {
//                System.out.print(" ");
//                j--;
//            }
//            System.out.print("*");
//            j = 1;
//            while (j < (i - 1) * 2) {
//                System.out.print(" ");
//                j++;
//            }
//            if (i == 1) {
//                System.out.print("\n");
//            } else {
//                System.out.print("*\n");
//            }
//            i++;
//        }
////print lower triangle
//
//        i = rows - 1;
//        while (i >= 1) {
//            j = rows;
//            while (j > i) {
//                System.out.print(" ");//print space
//                j--;
//            }
//            System.out.print("*");//print star
//            j = 1;
//            while (j < (i - 1) * 2) {
//                System.out.print(" ");
//                j++;
//            }
//            if (i == 1) {
//                System.out.print("\n");//move to next line
//            } else {
//                System.out.print("*\n");
//            }
//            i--;
//        }
    }
}