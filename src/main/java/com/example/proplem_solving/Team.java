package com.example.proplem_solving;

import java.util.Scanner;

public class Team

{
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of team  : " );
        int teames;
        int p1;
        int p2;
        int p3;
        int counter=0;

        teames=input.nextInt();
        System.out.println("teams");

while (teames != 0 ){

    p1=input.nextInt();
    p2=input.nextInt();
    p3=input.nextInt();

    if ((p1+p2+p3) >= 2){
        counter++;
    }
    teames--;
}
        System.out.println(counter);
    }
}
