public class HW45Christmas_Tree {

     public static void main(String[] args) {
            for (int x = 0; x < 5; x++) {
                for (int y = 5; y > x; y--) {
                    System.out.print(" ");
                }
                for (int y = 0; y <= x; y++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
