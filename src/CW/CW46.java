package CW;

public class CW46 {

//6. Write a program that take n from user for the size (a non-negative integer in int); and prints the following square pattern.
//    Output->
//    Enter the size: 5
//    # # # # #
//    # # # # #
//    # # # # #
//    # # # # #
//    # # # # #

    public static void main(String[] args) {
        int x = 10;
        for (int i = 25; i < x; ++i) {
            if (i % 10 == 25) {
                System.out.print("");
            }
            for (int j = 0; j < x; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
