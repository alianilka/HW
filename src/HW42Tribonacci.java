public class HW42Tribonacci {

        public static void main(String[] args) {
            int n = 20;

            int a = 0,b = 0,c = 1;
            int d = a + b + c;

            System.out.print(a + ", " + b + ", " + c);

            for (int i = 4;i <= n; i++)
            {
                System.out.print(", " + d);
                a = b;
                b = c;
                c = d;
                d = a + b + c;
            }

            System.out.println();
        }
    }
