package src.main.java.com.example.ProblemSolving;

import java.util.Scanner;

public class Magnets {

   public static  void main(String []args){


      Scanner input=new Scanner(System.in);
      int size;
      String temp=null;
      int counter=1;
      size=input.nextInt();
      int start=size;
      while (size != 0){ // 6  5  4  3  2  1
         String value=input.next();   // "10" "10" "10" "01" "10" "10"
         if (size==start){
            temp=value;
            size--;
            continue;
         }
         if (temp.charAt(1) == value.charAt(0) ){
            counter++;
         }
         temp=value;
         size--;
      }
      System.out.println(counter);

   }


}
