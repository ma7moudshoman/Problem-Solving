package com.example.proplem_solving;

import java.util.Scanner;

public class Digit {
    public static void main(String[]args){
        System.out.println("Enter Your Number");

        Scanner scanner=new Scanner(System.in);
        int value;
        int size;
        value=scanner.nextInt();
        size=scanner.nextInt();
        for (int i =0 ; i<size;i++){
            if ( value==0){
                System.out.println(0);
            continue;}
            while (value != 0){
                int number= value %10;
                System.out.print(number + " ");
                value/=10;
            }
            System.out.println();
        }

    }
}
