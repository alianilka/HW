package com.company;

// 16. Create a Java program and define all eight data types outside of main method with static keyword, and don’t initialise them.
// Print all of them inside your main method and see what default value is assigned to them by Java

public class HW16 {

    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static char c;
    static boolean bool;

    public static void main(String[] args) {
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bool);
    }

}