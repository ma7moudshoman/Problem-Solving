package com.example.proplem_solving;

import java.util.Scanner;

public class Welcome {
    public static void main(String[]args){
       Scanner input =new Scanner(System.in);

        System.out.println("Please Enter Your Numbers");

       int n1 , n2;
       n1=input.nextInt();
       n2=input.nextInt();

       if (n1>n2){
           System.out.println("yes");
       }
       else if (n1==n2){
           System.out.println("yes");
       }
       else {
           System.out.println("No");
       }
    }


    }


