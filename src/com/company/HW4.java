package com.company;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class HW4 {
    //4. Write program which count area of triangle. All values user has to input in console. S=(a*b*sinA)/2

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a :");
        double a = input.nextDouble();
        System.out.println("Input b :");
        double b = input.nextDouble();
        System.out.println("Input alfa :");
        double alfa = input.nextDouble();
        double area = (a * b * Math.sin(alfa)) / 2;
        System.out.println("Triangle area is" + area);

    }
}
