package com.company;

public class HW2 {

    //2. Write a program which count the area of circle and print result in console.
// You know radius, value can be fractional.

        public static void main(String[] args) {
            float radius = 3;
            double area = countArea(radius);
            printResult(area);
        }

        static double countArea(float i) {
            return Math.PI * Math.pow(i, 2);
        }

        static void printResult(double area) {
            System.out.println("area =" + area);
        }
    }
