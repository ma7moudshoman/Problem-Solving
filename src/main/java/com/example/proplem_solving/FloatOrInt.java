package com.example.proplem_solving;

import java.util.Scanner;

public class FloatOrInt {
    public static void main(String[]args){

        System.out.println("Enter your number");
        Scanner input=new Scanner(System.in);



        double num;
        num = input.nextDouble();

        int number = (int) num;
        double res = num - number;

        System.out.println(" int Number: " + number);
        System.out.println("Float Number: " + res);
    }

       /* double number;

        number=input.nextInt();

     int num= (int) number;
        System.out.println(number);*/

}
