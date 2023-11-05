package com.example.proplem_solving;

import java.util.Scanner;

public class Brothers {
    public  static  void  main(String[]args){

        Scanner input = new Scanner(System.in);
        String personName1, personName2;
        String dadName1, dadName2;

        System.out.println("Enter the first person's name:");
        personName1 = input.next();
        System.out.println("Enter the second person's name:");
        personName2 = input.next();
        System.out.println("Enter the first dad's name:");
        dadName1 = input.next();
        System.out.println("Enter the second dad's name:");
        dadName2 = input.next();

        if (dadName1.equals(dadName2)) {
            System.out.println("Are Brothers");
        } else {
            System.out.println("Not");
        }
    }
}







