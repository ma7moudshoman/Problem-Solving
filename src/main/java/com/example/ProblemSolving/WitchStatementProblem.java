package src.main.java.com.example.ProblemSolving;

import java.util.Scanner;

public class WitchStatementProblem {
    public static void main(String[]args){

        System.out.println("ENTER YOUR GRADE");
        Scanner scanner=new Scanner(System.in);
        char grade;
        grade=scanner.next().charAt(0);
        switch (grade){
            case 'A':
                System.out.println("Excellent");
      break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Fair");
                break;
            case 'F':
                System.out.println("Fail");
            default:
                System.out.println("Invalid Grade");
                }

        }







}
