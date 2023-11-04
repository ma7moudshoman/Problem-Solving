package com.example.proplem_solving;

import java.util.Scanner;


public class DisplayOutput {

    public static void main(String[] args) {


        Scanner Holla = new Scanner(System.in);

         int n1,n2,n3, total;
         double avg;
        System.out.println("Enter 3 numbers");
        n1= Holla.nextInt();
        n2= Holla.nextInt();
        n3= Holla.nextInt();
        total=sum(n1,n2,n3);
        avg=average(n1,n2,n3);
        display(total,avg);

    }

        public static int sum ( int number1, int number2, int number3 ){

            return number1 + number2 + number3;

        }
        public static double average ( int number1, int number2, int number3 )
        {

            return sum(number1, number2, number3) /3;
        }
        public static void display ( int s, double a){

            System.out.println("the sum of 3 numbers is : " + s);
            System.out.println("the average of 3 numbers is : " + a);
        }


    }

