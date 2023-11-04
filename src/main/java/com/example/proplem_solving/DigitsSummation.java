package com.example.proplem_solving;

import java.util.Scanner;

public class DigitsSummation {
    public  static void main(String[]args){


        Scanner  inout = new Scanner(System.in);

        System.out.println("Enter your number");
        long n1 , n2;


        n1=inout.nextInt();
        n2=inout.nextInt();

      n1 = n1 %10 ;
       n2 = n2 %10;



        System.out.println( " the last is : " + (n1));
        System.out.println( " the last is : " + (n2));



    }
}
