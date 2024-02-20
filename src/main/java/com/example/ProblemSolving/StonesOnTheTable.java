package src.main.java.com.example.ProblemSolving;

import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {



    Scanner input = new Scanner(System.in);

    int number = 0;
    String value;
    int Counter=0;
    number=input.nextInt(); // number of stone
    value=input.next(); //value of stone

        char[]values=value.toCharArray();
        for (int i=0;i<number;i++){
            if (i!=number-1 && values[i]==values[i+1]){
                Counter++;
            }

        }
        System.out.println(Counter);
}
}
