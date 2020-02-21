public class HW5_FibonacciRecursion {

    public static int fibonacciRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacciRecursion(n - 2) + fibonacciRecursion(n - 1);
    }

    public static void main(String args[]) {
        int maxNumber = 20;
        System.out.print("First " + maxNumber + " numbers in Fibonacci Series: ");
        for (int i = 0; i < maxNumber; i++) {
            System.out.print(fibonacciRecursion(i) + ", ");
        }
    }
}
