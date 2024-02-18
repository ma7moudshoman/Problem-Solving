package src.main.java.com.example.ProblemSolving;

import java.util.Scanner;

public class Multiplis {
    public  static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number ");

        int n1;
        int n2;
    n1=input.nextInt();
    n2=input.nextInt();
    int result=1;
   if (n1 % n2 == 0 || n2 % n1 == 0) {
       System.out.println(" multiplies ");
   }
   else
       System.out.println("no  multiplies");
    }
}
