package src.main.java.com.example.ProblemSolving;

import java.util.Scanner;

public class DioRoll {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);

        int num1=input.nextInt();
        int num2=input.nextInt();
        int count=6-Math.max(num1,num2)+1;

        String []arr ={"1/1","5/6","2/3","1/2","1/3","1/6"};
        System.out.println(arr[6-count]);

    }
}
