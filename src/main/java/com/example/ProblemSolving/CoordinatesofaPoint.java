package src.main.java.com.example.ProblemSolving;

import java.util.Scanner;

public class CoordinatesofaPoint {


    public  static void main(String[]args){

        Scanner input =new Scanner(System.in);
        System.out.println("Enter tow number");
        double num1 ,num2;
        num1=input.nextInt();
        num2=input.nextInt();
        if (num1==0&&num2==0){
            System.out.println("Origen");
        } else if (num1 == 0 && num2 != 0) {
            System.out.println("Eixo Y");
        } else if (num1 != 0 && num2 == 0) {
            System.out.println("Eixo X");
        }
        if (num1>0&&num2>0) {
             System.out.println("Q1");
         } else if (num1 < 0 && num2 > 0) {
             System.out.println("Q2");
         } else if (num1>0&&num2<0) {
             System.out.println("Q4");
         }
         else
             System.out.println("Q3");

    }

}
