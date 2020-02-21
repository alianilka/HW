import java.util.Scanner;

public class HW43Triangles {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Please, enter the size of the triangle:");
            int userInt = input.nextInt();

            System.out.println("a)");
            for (int x = 0; x < userInt; x++) {
                for (int y = 0; y <= x; y++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            System.out.println("b)");
            for (int x = 0; x < userInt; x++) {
                for (int y = userInt; y > x; --y) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            System.out.println("c)");
            for (int x = 0; x < userInt; x++) {
                for (int y = 0; y < x * 2; y++) {
                    System.out.print(" ");
                }
                for (int y = userInt; y > x; --y) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            System.out.println("d)");
            for (int x = 0; x < userInt; x++){
                for (int y = 2 * (userInt - x); y >= 0; --y) {
                    System.out.print(" ");
                }
                for (int y = 0; y <=x; y++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
