public class HW44Reverse_order {
    public static void main(String[] args) {
        double d = 1234.5678;
        String str = Double.toString(d);
        String strArray[] = str.split("\\.");

        int a = Integer.parseInt(strArray[0]);
        int b = Integer.parseInt(strArray[1]);
        System.out.print(b + "." + a);
    }
}