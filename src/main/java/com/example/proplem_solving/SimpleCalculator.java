package com.example.proplem_solving;

import java.util.Scanner;

public class SimpleCalculator {
  public static void main(String[]args){


      Scanner inout = new Scanner(System.in);


      /*
       int n1, n2 ;
      System.out.println("Please Enter Your number");
      n1=inout.nextInt();
      n2=inout.nextInt();
      System.out.println("sum of tow numbers is " + (n1+n2));
      System.out.println("Subtract of tow numbers is " + (n1*n2));

*/
      System.out.println("Please Enter Your number");
      int x,y,z,v;
      x=inout.nextInt();
      y=inout.nextInt();
      z=inout.nextInt();
      v=inout.nextInt();
long  result=(x * y )-(z * v);

      System.out.println( "the Differance is : " + result);
  }


}
