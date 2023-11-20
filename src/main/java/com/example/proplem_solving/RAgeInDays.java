package com.example.proplem_solving;

import java.util.Scanner;

public class RAgeInDays {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number of days : ");
         int days;
         int month;
         int year;
         days=input.nextInt();
         year=days/365;
         days -=365+year;
         month=days/30;
         days-=30*month;
        System.out.println("year : " + year);
        System.out.println("month : "+ month);
        System.out.println("days : "+days);
    }
}
