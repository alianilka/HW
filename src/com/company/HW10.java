package com.company;

// 10. Write a program which print to console current date and time in format yyyy/MM/dd HH:mm:ss

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HW10 {

    public static void main(String[] args) {
        Date date1 = new Date( );
        SimpleDateFormat x =  new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
        System.out.println("Current Date: " + x.format(date1));
    }

}