package com.example.proplem_solving;

import java.util.Scanner;

public class Option {

public static void  main(String[]args) {
    Scanner stat = new Scanner(System.in);
    int option, number1 = 50, number2 = 30;
    do {
        System.out.println("Select your option From Menu");
        System.out.println("1. sum 2 numbers");
        System.out.println("2. Subtract 2 numbers");
        System.out.println("3. Divide 2 numbers");
        System.out.println("0. to exit");
        option = stat.nextInt();
        switch (option) {
            case 1:
                System.out.println("sum of to numbers is   " + (number1 + number2));
                break;
            case 2:
                System.out.println("subtract of the 2 numbers is  " + (number1 - number2));
                break;
            case 3:
                System.out.println(  "Divide of the 2 numbers is  " + (double)+ (number1 / number2));
            case 0:
                System.out.println("Good bye");
break;
            default:
                System.out.println("invalid option");
                break;
        }
    }
        while (option != 0) ;


}
}





