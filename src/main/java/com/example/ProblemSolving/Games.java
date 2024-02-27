package src.main.java.com.example.ProblemSolving;

import java.util.Scanner;

public class Games {
    public static void main(String[]args){

        Scanner input =new Scanner(System.in);
         int size;
         int result=0;
         size=input.nextInt();  // 3
         int [] arr1 = new int[size];
         int [] arr2 = new int[size];


         for (int i =0; i<size; i++){
              arr1[i]=input.nextInt();   //  1   2   3
              arr2[i]=input.nextInt();   //  2   4   4
         }

        for (int i =0; i<size; i++) {
            for (int z =0; z<size; z++) {

                if (arr1[i]==arr2[z]){

                    result++;
                }

            }
        }
        System.out.println(result);
        }
}
