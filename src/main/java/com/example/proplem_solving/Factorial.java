package com.example.proplem_solving;

import java.util.Scanner;

public class Factorial {
    public static void main(String[]args){

System.out.println("Enter your Number");
       /* Scanner input=new Scanner(System.in);

  long y =input.nextInt();

   if (y ==1){
        System.out.println("No");}
else
       System.out.println("Yes");}
}*/

    // or
    Scanner input = new Scanner(System.in);

    long num = input.nextInt();
    long res = 1;
        for (long i = 1; i <= num; i++) {
        res *= i;
    }

            System.out.println( "res :  " + res);

}



}
