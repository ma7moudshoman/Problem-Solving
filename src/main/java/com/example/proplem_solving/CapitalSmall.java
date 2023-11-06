package com.example.proplem_solving;

import java.util.Scanner;

public class CapitalSmall {
      public static void main(String[]args){

          System.out.println("Enter your order");
          Scanner input = new Scanner(System.in);
   char m ;
   m=input.next().charAt(0);
   if (m >=97&& m<=122){

       System.out.println("Alpha :   "+"Is Small");

   } else if (m>=65&&m<=90) {
       System.out.println("Alpha :  " +"is Capital");
   }
   else
       System.out.println("number");


      }


}
