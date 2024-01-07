package com.example.proplem_solving;

import java.util.Scanner;

public class VenyandFENCE {
    public static void main(String[]args){

        Scanner input =new Scanner(System.in);

        int person;
        int wall;
        int result=0;
        int tallPerson;


person=input.nextInt(); //3
wall=input.nextInt();  //7
tallPerson=input.nextInt();

while (person!=0){   //  3  2  1
      result++;
if (tallPerson>wall){
    result++;
}
person--;

}
        System.out.println(result);

    }
}
