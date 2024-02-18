package src.main.java.com.example.ProblemSolving;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String [] args){

       //    3 example    ( choice anyone )


       /* System.out.println("1 : add tow number");
        System.out.println("2 : Subtract tow number");
        System.out.println("3 : GEt the square");*/
        Scanner  text=new Scanner(System.in);
     /*  int choice ;
        int number1;
        int number2;
choice=text.nextInt();


        switch (choice)
        {
            case 1:
            System.out.println("1 : Enter tow number");
            number1=text.nextInt();
            number2=text.nextInt();
                System.out.println(number1 + number2);

                break;

            case 2:
                System.out.println("2: Subtract tow number ");
                number1=text.nextInt();
                number2=text.nextInt();
                System.out.println(number1 - number2);

                break;
            case 3:
                System.out.println("3 : GEt the square");
                number1=text.nextInt();
if (number1>0){
    System.out.println(number1*number1);
    break;


}
            default:
                System.out.println("invalid Input Choice");
        }

/*
char letter;
 letter=text.next().charAt(0);
 switch (letter){
     case 'a':
     case 'e':
     case 'o':
     case 'u':
     case 'i':
         System.out.println("right answer");
         break;
     default:
         System.out.println("invalid letter");


 }*/

        int grade =0 , sum=0, counter=1;
        while (counter<=6 && grade!=-1){
            System.out.println("Enter Your Grade or -1 to Exit " + counter);
            grade=text.nextInt();
            sum+=grade;
            counter++;
        }
        System.out.println("Average of 6 grades  " + sum/6);
    }
}
