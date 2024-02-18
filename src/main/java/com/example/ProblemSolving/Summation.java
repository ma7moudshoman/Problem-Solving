package src.main.java.com.example.ProblemSolving;

import java.util.Scanner;

public class Summation {
    public  static  void  main(String[]args){

        Scanner input =new Scanner(System.in);
        System.out.println("Enter your number ");
 int n ;
 n =input.nextInt();
  n=n*(n+1)/2;
        System.out.println(" result is :  " +n);
    }

}
