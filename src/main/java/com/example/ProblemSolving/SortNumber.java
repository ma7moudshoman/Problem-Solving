package src.main.java.com.example.ProblemSolving;

import java.util.Scanner;

public class SortNumber {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, number3;
        int max = 0, min = 0, def = 0;
        number1 = input.nextInt();
        number2 = input.nextInt();
        number3 = input.nextInt();

        if (number1 >= number2 && number1 >= number3) {
                 if (number2 >= number3) {
                System.out.println("number2=min");
            }    else number3 = def;
        }
        else if (number2 >= number1 && number2 >= number3) {
            System.out.println("number2=max");
                 if (number1 >= number3) {
                System.out.println("number1=min");
            }
                 else number3 = def;
        }


        else {
            number3 = max;
        }
    }

}

