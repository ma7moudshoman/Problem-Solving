package src.main.java.com.example.ProblemSolving;

import java.util.Scanner;

public class FirstDigit {
    public  static void main(String[]args){

        Scanner input =new Scanner(System.in);
        System.out.println("Enter your number");

        int num ;
        num=input.nextInt();
 int result= num/1000;              // any number abstract (1000) will give me the first number  like (4569/1000 )= (4)
        System.out.println(result);
        if (result%2==0){
            System.out.println("EVEN NUMBER");
        }
        else
            System.out.println("ODD NUMBER");

    }

}
