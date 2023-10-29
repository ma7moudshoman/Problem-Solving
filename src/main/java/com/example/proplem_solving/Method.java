package com.example.proplem_solving;

import java.util.Scanner;

public class Method {


    public static void main(String[]args){

        Scanner input=new Scanner(System.in);

        System.out.println("Hello You Are Welcome ");
        drawline('&',20);
        System.out.println(" Do You Good With Our Presentation  ");
drawline('$', 16);

// **********************************************

int  s=10, p=30 , total;
        System.out.println(sum(s,p));
total=sum(s,p) /2;
total=sum(s,p) * 3;
        System.out.println(total  );
    }



    //          ####  another Example  ###


    public static void drawline(char h ,int length)

    {
        for (int i = 0; i < length  ; i++) {
            System.out.print(h);

        }
        System.out.println();

    }


    // ****************************
    public  static  int sum (int k , int l ){
         int result=0;
         result=k*l;
         return result;
    }

    }