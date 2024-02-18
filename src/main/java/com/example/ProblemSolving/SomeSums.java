package src.main.java.com.example.ProblemSolving;

import java.util.Scanner;

public class SomeSums {

    public static void main(String[] args) {
        System.out.println("Enter your numbers");
        Scanner scanner = new Scanner(System.in);

        int num;        // 20
        int value1;     // 2
        int value2;     // 5


        num = scanner.nextInt();
        value1 = scanner.radix();
        value2 = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (i / 10 == 0) {
                if (i >= value1 && i <= value2) {
                    sum += i;

                }




            } else {
                int number = i;   // 15
                int mysum=0;
                while (number != 0) {

                   int  mynum = number % 10;  //  15/10 ===> 5
                    mysum += mynum;
                    number /= 10;  // 15/10 ====>  1

                }
                if (mysum >= value1 && mysum <= value2) {
                    sum += i;
                }
            }
        }
            System.out.println(sum);

        }



}
