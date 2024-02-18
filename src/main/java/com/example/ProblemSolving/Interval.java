package src.main.java.com.example.ProblemSolving;

import java.util.Scanner;

public class Interval {

public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter your number");
    int number;
    number=input.nextInt();
    if(number>=0&&number<=25){
        System.out.println("interval 1 [0,25]");
    } else if (number>=25 && number <= 50) {
        System.out.println("interval 2 [25,50]");
    } else if (number >= 50 &&number<=75){
        System.out.println("interval 3 [50,75]");
    } else if (number >= 75 && number <= 100) {
        System.out.println("interval 4 [100,75]");
    }else
        System.out.println("invalid interval");


}

}
