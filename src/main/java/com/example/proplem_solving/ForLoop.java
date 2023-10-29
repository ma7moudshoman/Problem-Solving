package com.example.proplem_solving;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[]args){
        Scanner stat =new Scanner(System.in);
       /* int gender, sum=0, counter=1;

        for (int i=1;i<=6;i++){
            System.out.println("enter your grade " + counter);
            gender=stat.nextInt();
            sum+=gender;
            counter++;

        }
        System.out.println("average of gender is :  " + sum/6);*/


       //     another example
  int number, sumeven=0,sumodd=0;

        for (int i=1;i<=10;i++){
            System.out.println("Enter  number"  + i);
            number=stat.nextInt();
     if (i%2==0){
         sumeven+=number;
     }
     else

sumodd+=number;
        }
        System.out.println("the sum of even number " +sumeven);
        System.out.println("the sum of even number " +sumodd);

    }


}
