package src.main.java.com.example.ProblemSolving;

import java.util.Scanner;

public class Flag {


    public static void main(String[] args) {

        System.out.println("Enter Your Number"  );
        Scanner reader = new Scanner(System.in);
      /*  double number;
        double sum = 0.0;
        boolean value = true;
        while (value == true) {
             number = reader.nextDouble();

            if (number < 0)
                value = false;

            else sum += number;

        }
        System.out.println("sum of input " + sum);
*/
int rand, guess;
rand= (int) (Math.random()*100);
boolean stillplay=true;
while (stillplay)
{
    System.out.println("Guess a number between 50 to 100 ");
    guess=reader.nextInt();
    if (guess>rand)
        System.out.println("Guess to large");
    else
        if (guess<rand)
            System.out.println("Guess to small");
        else {
            System.out.println("you win");
            stillplay=false;
        }

}

    }

}
