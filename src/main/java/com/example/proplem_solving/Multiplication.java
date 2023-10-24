package com.example.proplem_solving;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int num;
        int result;
        num=scanner.nextInt();
        for (int i=1 ; i<=12;i++){
            result =num*i;
            System.out.println(num + "*" +i+"="+result );
        }
    }
}
