package com.example.proplem_solving;

import java.util.Scanner;

import static com.example.proplem_solving.Method.sum;

public class Integer {
    public static void main(String[] args) {


        Scanner Holla = new Scanner(System.in);

        int number1, number2, number3 ,sum=1;
sum=(number1+number2+number3);
        System.out.println(" Please Enter 3 numbers  ");
        number1= Holla.nextInt();
        number2=Holla.nextInt();
        number3=Holla.nextInt();

        System.out.println("the sum of numbers is :  "  + sum(number1+number2+number3));


    }
}