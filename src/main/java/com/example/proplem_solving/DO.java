package com.example.proplem_solving;

import java.util.Scanner;

public class DO {
    public static void main(String[]args) {
        Scanner test = new Scanner(System.in);
        int grade , sum=0 , counter = 1 ;
        do {
            System.out.println("Enter your Grade for number  " + counter);

            grade = test.nextInt();
            sum += grade ;
            counter++;

        }
        while (counter<=6);
        System.out.println("Average grade is "+sum/6);
    }

}
