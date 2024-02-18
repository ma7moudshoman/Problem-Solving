package src.main.java.com.example.ProblemSolving;

import java.util.Scanner;

public class Twonumbers {
    public  static  void  main(String[]args) {

        Scanner input = new Scanner(System.in);

    double n1;
    double n2;
    n1=input.nextInt();
    n2=input.nextInt();
double result=n1/n2;;

        System.out.println("floor " + n1 + " / " + n2 + " = " + Math.floor(result));
        System.out.println("ceil " + n1 + " / " + n2 + " = " + Math.ceil(result));
        System.out.println("round " + n1 + " / " + n2 + " = " + Math.round(result));

    }
}
