package src.main.java.com.example.ProblemSolving;

import java.util.Scanner;

public class Juicer {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);

        int size=input.nextInt(); // 2
        int orangeSize=input.nextInt(); // 7
        int max=input.nextInt(); // 10
        int sum=0;
        int counter=0;


        while (size!=0){

            int orange = input.nextInt();
            if (orange<=orangeSize){
                sum+=orange;
            }
            if (sum>max){
                counter++;
                sum=0;
            }
            size--;
        }

        System.out.println(counter);
    }
}
