package src.main.java.com.example.ProblemSolving;

import java.util.Scanner;

public class Char {
    public static void main(String[]args){

        System.out.println("Enter your order ");
        Scanner input =new Scanner(System.in);

        char n, result;
        n=input.next().charAt(0);

        int ask=n;
        if (ask>=97&&ask<=122){
            ask=ask-32;
            result = (char) ask;
            System.out.println(result);
        } else if (ask >= 65 && ask <= 90) {
            ask=ask+32;
            result=(char) ask;
            System.out.println(result);
        }
else
            System.out.println("number");

    }
}
