package com.example.proplem_solving;

import java.util.Scanner;

public class Bearandbrathers {
    public static void main(String[]args){

        Scanner input=new Scanner(System.in);
        int a;
        int b;
        int years=0;
        a=input.nextInt();
        b=input.nextInt();
        while (a<=b){
            a*=3;
            b*=2;
            years ++;
        }
        System.out.println(years);


    }
}
