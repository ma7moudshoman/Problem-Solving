package src.main.java.com.example.ProblemSolving;

import java.util.Scanner;

public class BeautifulMatrix {
public static void main(String[]args) {
    Scanner input =new Scanner(System.in);
    //   (R-3) + (L-3) = the number of steps;
    int number;
for (int i=0;i<=5;i++){
    for (int s=0;s<=5;s++){
        number=input.nextInt();

        if (number==1){


            System.out.println(Math.abs(i-3)+Math.abs(s-3));

            return;
        }
    }
}
       /* 0 0 0 0 0
        0 0 0 0 1
        0 0 0 0 0
        0 0 0 0 0
        0 0 0 0 0*/


}
}
