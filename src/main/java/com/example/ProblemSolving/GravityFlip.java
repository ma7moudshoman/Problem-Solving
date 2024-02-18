package src.main.java.com.example.ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class GravityFlip {
    public static void main(String[]args){

        Scanner input=new Scanner(System.in);

int size;
size=input.nextInt();
  int [] arr=new int[size];
  for (int i=0; i<size;i++){
      arr[i]=input.nextInt();
  }
        Arrays.sort(arr);
        for (int i=0; i<size;i++){
            System.out.print(i + " ");
        }
    }
}
