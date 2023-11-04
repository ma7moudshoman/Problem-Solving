package com.example.proplem_solving;

import java.util.Scanner;

public class AreaofaCircle {

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Entre yor r" );
        double r ;
        double by=3.14;

        r=input.nextInt();


        System.out.println("Area of Circle"+ (by * r *r));
    }

}
